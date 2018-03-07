package io.payrun.helpers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SerializerHelper {

    private final ObjectMapper mapper;

    public SerializerHelper() {
        this.mapper = new ObjectMapper();
        this.mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        this.mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        this.mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        this.mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public String toJson(Object toBeSerialised) {
        try {
            return mapper.writeValueAsString(toBeSerialised);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public <T extends Object> T fromJson(String json, Class<T> cls) {
        try {
            return mapper.readValue(json, cls);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
