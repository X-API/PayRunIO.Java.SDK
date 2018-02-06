package io.payrun.models;

import io.payrun.helpers.SerializerHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkTest {
    @Test
    public void givenInstance_WhenSerialising_ThenReturnExpected(){
        Link instance = new Link();

        instance.title = "Title";
        instance.href = "/Employer/ER001/Employee/EE001";
        instance.targetType = "Employee";

        String result = SerializerHelper.toJson(instance);

        System.out.println(result);

        Assertions.assertNotNull(result);
        Assertions.assertEquals("{\"Link\":{\"@title\":\"Title\",\"@href\":\"/Employer/ER001/Employee/EE001\",\"@rel\":\"Employee\"}}", result);
    }

    @Test
    public void givenInputString_WhenDeSerialising_ThenReturnExpected(){
        Link instance = SerializerHelper.fromJson("{\"Link\":{\"@title\":\"Title\",\"@href\":\"/Employer/ER001/Employee/EE001\",\"@rel\":\"Employee\"}}", Link.class);

        Assertions.assertEquals("Title", instance.title);
        Assertions.assertEquals("/Employer/ER001/Employee/EE001", instance.href);
        Assertions.assertEquals("Employee", instance.targetType);
    }
}
