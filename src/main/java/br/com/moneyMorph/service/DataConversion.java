package br.com.moneyMorph.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/** This class is responsible for converting JSON data into a Java object. */
public class DataConversion implements IDataConversion {

    private final ObjectMapper mapper = new ObjectMapper();

    /** Converts JSON data into a Java object.
     * @param jsonData JSON data to be converted.
     * @param clazz Class of the object to be converted.
     * @return The Java object converted from the JSON data.
     */
    @Override
    public <T> T convert(String jsonData, Class<T> clazz) {
        try {
            return mapper.readValue(jsonData, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}