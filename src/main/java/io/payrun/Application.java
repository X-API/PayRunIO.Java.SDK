package io.payrun;

import io.payrun.helpers.RequestHelper;

public class Application {

    public static void main(String args[]) {
        try {
            RequestHelper request =
                    new RequestHelper(
                            "https://api.test.payrun.io",
                            "pOtm4mjq5EO4wtkYjkDphQ",
                            "jS2RUVXxEudnahuwfvKAMPaMCmyXFUmKN2ZlC7x2qA",
                            "default");

            SimplePayroll simplePayroll = new SimplePayroll();

            simplePayroll.Execute(request);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}