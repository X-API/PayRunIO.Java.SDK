package io.payrun;

import io.payrun.helpers.RequestHelper;

public class Application {

    public static void main(String args[]) {
        try {
            RequestHelper request = new RequestHelper("http://localhost:3578","ati0cm6U8Eyl8Dt9oX5eXg", "sBapv7pScUGk7vfjwSCdtwc3BCEC8WQUuEr4Kt34RdRw");

            SimplePayroll simplePayroll = new SimplePayroll();

            simplePayroll.Execute(request);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}