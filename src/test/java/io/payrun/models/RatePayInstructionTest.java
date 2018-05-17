package io.payrun.models;

import io.payrun.helpers.SerializerHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class RatePayInstructionTest {

    private SerializerHelper serializerHelper;

    @BeforeEach
    void setUp() {
        serializerHelper = new SerializerHelper();
    }

    @Test
    public void givenRatePayInstructionInstance_WhenSerialising_ThenExpectedJsonCreated() throws Exception {
        RatePayInstruction ratePayInstruction1 = new RatePayInstruction();
        ratePayInstruction1.code = "code";
        ratePayInstruction1.rate = 12.2;
        ratePayInstruction1.rateUoM = UomBasicPay.Day;
        ratePayInstruction1.units = 32.3;
        ratePayInstruction1.description = "description";

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.MONTH, 0);
        cal.set(Calendar.YEAR, 2018);
        ratePayInstruction1.startDate = cal.getTime();
        cal.set(Calendar.DAY_OF_MONTH, 10);
        cal.set(Calendar.MONTH, 9);
        cal.set(Calendar.YEAR, 2018);
        ratePayInstruction1.endDate = cal.getTime();

        String serializedRatePayInstruction = serializerHelper.toJson(ratePayInstruction1);
        Assertions.assertEquals(
                "{\"RatePayInstruction\":{\"StartDate\":\"2018-01-01\",\"EndDate\":\"2018-10-10\",\"Description\":\"description\",\"Code\":\"code\",\"Rate\":12.2,\"RateUoM\":\"Day\",\"Units\":32.3}}",
                serializedRatePayInstruction);
    }

}
