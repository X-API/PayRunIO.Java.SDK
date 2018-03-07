package io.payrun.models;

import io.payrun.helpers.SerializerHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkCollectionTest {

    private SerializerHelper serializerHelper;

    @BeforeEach
    void setUp() {
        serializerHelper = new SerializerHelper();
    }

    @Test
    public void givenInstance_WhenSerialising_ThenReturnExpected(){
        LinkCollection instance = new LinkCollection();

        Link child = new Link();
        child.title = "Title";
        child.href = "/Employer/ER001/Employee/EE001";
        child.targetType = "Employee";

        instance.getLinks().add(child);

        String result = serializerHelper.toJson(instance);

        System.out.println(result);

        Assertions.assertNotNull(result);
        Assertions.assertEquals("{\"LinkCollection\":{\"Links\":{\"Link\":[{\"@title\":\"Title\",\"@href\":\"/Employer/ER001/Employee/EE001\",\"@rel\":\"Employee\"}]}}}", result);
    }

    @Test
    public void givenInputString_WhenDeSerialising_ThenReturnExpected(){
        LinkCollection instance = (LinkCollection)serializerHelper.fromJson("{\"LinkCollection\":{\"Links\":{\"Link\":[{\"@title\":\"Title\",\"@href\":\"/Employer/ER001/Employee/EE001\",\"@rel\":\"Employee\"}]}}}", LinkCollection.class);

        Assertions.assertNotNull(instance);

        Assertions.assertEquals(1, instance.getLinks().toArray().length);
        Assertions.assertEquals("Title", instance.getLinks().get(0).title);
        Assertions.assertEquals("/Employer/ER001/Employee/EE001", instance.getLinks().get(0).href);
        Assertions.assertEquals("Employee", instance.getLinks().get(0).targetType);
    }
}
