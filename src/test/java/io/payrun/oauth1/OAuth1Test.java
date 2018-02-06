package io.payrun.oauth1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;

class OAuth1Test {

    @Test
    public void givenConsumerKeyAndSecret_WhenGenerateSignature_ThenResultIsNotNull() {
        String consumerKey = "ConsumerKey";
        String consumerSecret = "ConsumerSecret";

        OAuth1 generator = new OAuth1(consumerKey, consumerSecret);

        final URI uri = getUri("http://host:1234/Path?QueryA=1&QueryB=2");
        if (uri == null) return;

        String signature = generator.generateSignature(uri, "get");

        System.out.println(signature);

        Assertions.assertNotNull(signature);
    }

    @Test
    public void givenAllParameters_WhenGenerateSignature_ThenReturnExpectedResult() {
        final String consumerKey = "ConsumerKey";
        final String consumerSecret = "ConsumerSecret";
        final String nonce = "ABCDEFG";
        final int timeStamp = 891010;

        OAuth1 generator = new OAuth1(consumerKey, consumerSecret, timeStamp, nonce);

        final URI uri = getUri("http://host:1234/Path?QueryA=1&QueryB=2");
        if (uri == null) return;

        String signature = generator.generateSignature(uri, "get");

        System.out.println(signature);

        Assertions.assertEquals("jS9npah5NRfe2rd86QRbqVuu2BM%3D", signature);
    }

    @Test
    public void givenAllParameters_WhenBuildHeader_ThenExpectedResultReturned() {
        final String consumerKey = "ConsumerKey";
        final String consumerSecret = "ConsumerSecret";
        final String nonce = "ABCDEFG";
        final int timeStamp = 891010;

        OAuth1 generator = new OAuth1(consumerKey, consumerSecret, timeStamp, nonce);

        String result = generator.buildHeader("hVMhBsMURIUTb%2FciFHKaEoADF7w%3D");

        Assertions.assertEquals("OAuth oauth_consumer_key=\"ConsumerKey\", oauth_nonce=\"ABCDEFG\", oauth_signature=\"hVMhBsMURIUTb%2FciFHKaEoADF7w%3D\", oauth_signature_method=\"HMAC-SHA1\", oauth_timestamp=\"891010\", oauth_version=\"1.0\"", result);
    }

    @Test
    public void givenParameterSetA_WhenGenerateSignature_ThenReturnExpectedResult() {
        testUrlAgainstSignature(
                "http://Test.PayRunIO.Com:12345/Path/Page?O=1",
                "lBkoA2ZB51vu6kP3Pz1hWsmPHSE%3D");
    }

    @Test
    public void givenParameterSetB_WhenGenerateSignature_ThenReturnExpectedResult() {
        testUrlAgainstSignature(
                "http://Test.PayRunIO.Com:12345/Path/Page?P=1",
                "%2BWr9yXflPYcvC754BdYYSg1iW4k%3D");
    }

    @Test
    public void givenParameterSetC_WhenGenerateSignature_ThenReturnExpectedResult() {
        testUrlAgainstSignature(
                "http://Test.PayRunIO.Com:12345/Path/Page?query=1&Query=2",
                "MNobOsFUJlTTUKaXm4T7V2KvPlM%3D");
    }

    @Test
    public void givenParameterSetD_WhenGenerateSignature_ThenReturnExpectedResult() {
        testUrlAgainstSignature(
                "http://Test.PayRunIO.Com:12345/Path/Page?query=1&Query=2&query",
                "rkBziieG4YSOSzzPpfWYnk1YvkE%3D");
    }

    @Test
    public void givenParameterSetE_WhenGenerateSignature_ThenReturnExpectedResult() {
        testUrlAgainstSignature(
                "http://localhost:3578/ReportTransform?reportDataUri=%2FReport%2FP60%2Frun%3FEmployerKey%3DER001%26TaxYear%3D2016&TransformDefinitionId=P60-2016-Pdf",
                "2AI%2BfixePRnreDkoEQogKOLr2jo%3D");
    }

    @Test
    public void givenParameterSetF_WhenGenerateSignature_ThenReturnExpectedResult() {
        testUrlAgainstSignature(
                "http://localhost:3578/Report/PAYSLIP/run?EmployerKey=ER001&TaxYear=2017&TaxPeriod=1&EmployeeCodes=EE001",
                "0%2B3Hp6Qz6lI5aNeXRZsbdAXTkEw%3D");
    }

    private void testUrlAgainstSignature(String url, String expectedSignature){
        final String consumerKey = "CONSUMERKEY";
        final String consumerSecret = "CONSUMERSECRET";
        final String nonce = "NONCE";
        final int timeStamp = 1454589108;

        OAuth1 generator = new OAuth1(consumerKey, consumerSecret, timeStamp, nonce);

        final URI uri = getUri(url);
        if (uri == null) return;

        String signature = generator.generateSignature(uri, "GET");

        System.out.println(signature);

        Assertions.assertEquals(expectedSignature, signature);
    }

    private URI getUri(String url) {
        URI uri = null;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
        }
        return uri;
    }
}