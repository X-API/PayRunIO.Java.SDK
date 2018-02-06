package io.payrun.helpers;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

public class SerializerHelper {
    private static ObjectMapper mapper;

    public static String toJson(Object toBeSerialised){
        try {
            return getMapper().writeValueAsString(toBeSerialised);
        } catch (JsonParseException | JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static <T extends Object> T fromJson(String json, Class<T> cls) {
        try {
            return getMapper().readValue(json, cls);
        } catch (JsonParseException | JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static ObjectMapper getMapper(){
        if (mapper == null)
        {
            mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
            mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        }

        return mapper;
    }
}
