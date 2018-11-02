package io.payrun;

import io.payrun.helpers.RequestHelper;

public class Application {

    public static void main(String args[]) {
        try {
            RequestHelper request =
                    new RequestHelper(
                            "https://api.test.payrun.io",
                            "ozPpjEMEPUJ6genpa2lw",
                            "Vj7fC5oh02u2g0Hm4pEXA6crI57lh9UiHC0wPg6lQyg",
                            "18.19.1.481");

            SimplePayroll simplePayroll = new SimplePayroll();

            simplePayroll.Execute(request);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}