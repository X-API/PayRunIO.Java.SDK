package io.payrun;

import io.payrun.helpers.RequestHelper;

public class Application {

    public static void main(String args[]) {
        try {
            RequestHelper request =
                    new RequestHelper(
                            "https://api.test.payrun.io",
                            "KNCt4JAGnEiNK4HSo0bQpg",
                            "ZzHT9u2Ee0uuVb5Y5nJwASHCnGYpwdUurQYMXCn2zow");

            SimplePayroll simplePayroll = new SimplePayroll();

            simplePayroll.Execute(request);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}