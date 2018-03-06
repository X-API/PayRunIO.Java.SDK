package io.payrun.helpers;

import io.payrun.models.Link;
import io.payrun.oauth1.OAuth1;
import org.springframework.http.*;
import org.springframework.lang.Nullable;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

import static java.util.Collections.singletonList;

public class RequestHelper {

    private final String apiHost;
    private final String consumerKey;
    private final String consumerSecret;
    private final SerializerHelper serializerHelper;

    public RequestHelper(String apiHost, String clientKey, String clientSecret){
        this.apiHost = apiHost;
        this.consumerKey = clientKey;
        this.consumerSecret = clientSecret;
        this.serializerHelper = new SerializerHelper();
    }

    public String getRaw(String path){
        URI uri = getUri(path);

        if (uri == null) return null;

        ResponseEntity<String> response = this.getResponse(uri, HttpMethod.GET);

        return response.getBody();
    }

    public <T extends Object> T get(String path, Class<T> clss){
        URI uri = getUri(path);

        if (uri == null) return null;

        ResponseEntity<String> response = this.getResponse(uri, HttpMethod.GET);

        T output = serializerHelper.fromJson(response.getBody(), clss);

        return output;
    }

    public Link post(String path, Object objectToPost){
        URI uri = getUri(path);

        if (uri == null) return null;

        ResponseEntity<String> response = this.getResponse(uri, HttpMethod.POST, objectToPost);

        Link output = serializerHelper.fromJson(response.getBody(), Link.class);

        return output;
    }

    public <T extends Object> T put(String path, T objectToPut){
        URI uri = getUri(path);

        if (uri == null) return null;

        ResponseEntity<String> response = this.getResponse(uri, HttpMethod.PUT, objectToPut);

        T output = (T)serializerHelper.fromJson(response.getBody(), objectToPut.getClass());

        return output;
    }

    public <T extends Object> T patch(String path, String patch, Class<T> clss){
        URI uri = getUri(path);

        if (uri == null) return null;

        ResponseEntity<String> response = this.getResponse(uri, HttpMethod.PATCH, patch);

        T output = serializerHelper.fromJson(response.getBody(), clss);

        return output;
    }

    public void delete(String path){
        URI uri = getUri(path);

        if (uri == null) return;

        this.getResponse(uri, HttpMethod.DELETE);
    }

    private URI getUri(String path) {
        URI uri = null;

        try {
            uri = new URI(this.apiHost + path);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return uri;
    }

    private ResponseEntity<String> getResponse(URI uri, HttpMethod verb) {
        return getResponse(uri, verb, null);
    }

    private ResponseEntity<String> getResponse(URI uri, HttpMethod verb, @Nullable Object objectToTransmit)
    {
        OAuth1 oAuth1 = new OAuth1(this.consumerKey, this.consumerSecret);
        String signature = oAuth1.generateSignature(uri, verb.name());
        String headerValue = oAuth1.buildHeader(signature);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", headerValue);
        headers.setAccept(singletonList(MediaType.APPLICATION_JSON));

        RestTemplate restTemplate = new RestTemplate();

        String payload = null;

        if (objectToTransmit != null){
            if (objectToTransmit instanceof String){
                payload = (String)objectToTransmit;
            }
            else {
                payload = serializerHelper.toJson(objectToTransmit);
            }

            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setContentLength(payload.length());
        }

        final HttpEntity<String> request = new HttpEntity<>(payload, headers);

        try{
            ResponseEntity<String> response = restTemplate.exchange(uri, verb, request, String.class);

            return response;
        }
        catch (HttpClientErrorException e) {
            System.out.println(verb.name());
            System.out.println(uri.toString());

            if (payload != null)
            {
                String[] lines = payload.split("\\n");

                for (String line : lines) {
                    System.out.println(line);
                }
            }
            System.out.println(e.getStatusCode());
            System.out.println(e.getResponseBodyAsString());
            throw e;
        }
    }
}
