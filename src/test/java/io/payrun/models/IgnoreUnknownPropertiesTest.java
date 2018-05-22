package io.payrun.models;

import io.payrun.helpers.SerializerHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IgnoreUnknownPropertiesTest {

    private SerializerHelper serializerHelper;

    @BeforeEach
    void setUp() {
        serializerHelper = new SerializerHelper();
    }

    @Test
    public void shouldNotFailWhenInputJSONContainsUnknownProperties() {
        BankAccount bankAccount = serializerHelper
                .fromJson("{\"BankAccount\":{\"AccountName\":\"name\",\"AccountNumber\":\"number\",\"SortCode\":\"sortcode\",\"UnknownProperty\":42}}", BankAccount.class);
        assertEquals("name", bankAccount.accountName);
        assertEquals("number", bankAccount.accountNumber);
        assertEquals("sortcode", bankAccount.sortCode);
    }
}
