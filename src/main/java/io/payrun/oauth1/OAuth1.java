package io.payrun.oauth1;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

public class OAuth1 {

    private static final String OAUTH_VERSION = "1.0";
    private static final String OAUTH_SIGNATURE_METHOD = "HMAC-SHA1";

    private static final char[] NONCE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
            .toCharArray();
    private static final int NONCE_LENGTH = 32;

    private static final String OAUTH_PARAM_CONSUMER_KEY = "oauth_consumer_key";
    private static final String OAUTH_PARAM_TIMESTAMP = "oauth_timestamp";
    private static final String OAUTH_PARAM_NONCE = "oauth_nonce";
    private static final String OAUTH_PARAM_SIGNATURE = "oauth_signature";
    private static final String OAUTH_PARAM_SIGNATURE_METHOD = "oauth_signature_method";
    private static final String OAUTH_PARAM_VERSION = "oauth_version";

    private final String consumerKey;
    private final String consumerSecret;
    private final long timestamp;
    private final String nonce;

    public OAuth1(String consumerKey, String consumerSecret) {
        this(consumerKey, consumerSecret, new Date().getTime() / 1000, generateNonce());
    }

    public OAuth1(String consumerKey, String consumerSecret, long timestamp, String nonce) {
        this(consumerKey, consumerSecret, (int) timestamp, nonce);
    }

    public OAuth1(String consumerKey, String consumerSecret, int timestamp, String nonce) {
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.timestamp = timestamp;
        this.nonce = nonce;
    }

    public String generateSignature(URI uri, String httpVerb) {
        String signatureBase = getSignatureBase(uri, httpVerb);

        HmacUtils hmac = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, escapeDataStringEquivalent(consumerSecret) + "&");

        return escapeDataStringEquivalent(Base64.encodeBase64String(hmac.hmac(signatureBase)));
    }

    public String buildHeader(String signature) {
        return "OAuth "
                + OAUTH_PARAM_CONSUMER_KEY + "=\"" + consumerKey + "\", "
                + OAUTH_PARAM_NONCE + "=\"" + nonce + "\", "
                + OAUTH_PARAM_SIGNATURE + "=\"" + signature + "\", "
                + OAUTH_PARAM_SIGNATURE_METHOD + "=\"" + OAUTH_SIGNATURE_METHOD + "\", "
                + OAUTH_PARAM_TIMESTAMP + "=\"" + timestamp + "\", "
                + OAUTH_PARAM_VERSION + "=\"" + OAUTH_VERSION + "\"";
    }

    private String getSignatureBase(URI uri, String httpVerb) {
        final String scheme = uri.getScheme();
        final int port = uri.getPort();
        String portString = "";

        if (port != -1 && (scheme.equals("http") && port != 80 || scheme.equals("https") && port != 443)){
            portString = ":" + String.valueOf(port);
        }

        String normUrl = scheme + "://" + uri.getHost().toLowerCase() + portString + uri.getPath();

        String normalizedParams = escapeDataStringEquivalent(normalizeParams(uri));

        return httpVerb + "&" + escapeDataStringEquivalent(normUrl) + "&" + normalizedParams;
    }

    private String normalizeParams(URI url) {
        Multimap<String, String> params = HashMultimap.create();

        final String query = url.getRawQuery();

        if (query != null) {
            Arrays.stream(query.split("&"))
                    .map(queryParam -> {
                        String[] keyValue = queryParam.split("=");
                        String key = keyValue[0];
                        String value = keyValue.length > 1 ? keyValue[1] : "";
                        // Use presence of % to determine escape status
                        if (!value.contains("%")){
                            value = escapeDataStringEquivalent(value);
                        }
                        return new String[] { key, value };
                    })
                    .forEach(keyValue -> params.put(keyValue[0], keyValue[1]));
        }

        params.put(OAUTH_PARAM_CONSUMER_KEY, consumerKey);
        params.put(OAUTH_PARAM_TIMESTAMP, String.valueOf(timestamp));
        params.put(OAUTH_PARAM_NONCE, nonce);
        params.put(OAUTH_PARAM_SIGNATURE_METHOD, OAUTH_SIGNATURE_METHOD);
        params.put(OAUTH_PARAM_VERSION, OAUTH_VERSION);

        return params.entries().stream()
                .map(e -> e.getKey() + "=" + e.getValue())
                .sorted()
                .collect(Collectors.joining("&"));
    }

    private static String generateNonce() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < NONCE_LENGTH; i++) {
            sb.append(NONCE_CHARS[(int) Math.floor(Math.random() * NONCE_CHARS.length)]);
        }
        return sb.toString();
    }

    // this is the equivalent of .NET Uri.EscapeDataString
    private String escapeDataStringEquivalent(String toEscape) {
        try {
            return URLEncoder.encode(toEscape, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}

