package com.npci.lms.library.model.converter;

import com.dpi.financial.ftcom.utility.json.JsonCollectors;

import javax.persistence.AttributeConverter;
import java.util.HashMap;
import java.util.Map;

public class JsonConverter implements AttributeConverter<Map<String, String>, String> {
    @Override
    public String convertToDatabaseColumn(Map<String, String> headers) {
        return headers.entrySet().stream().collect(JsonCollectors.toJsonBuilder()).build().toString();
    }

    @Override
    public Map<String, String> convertToEntityAttribute(String json) {
        return new HashMap<>();
    }
}
