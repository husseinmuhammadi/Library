package com.npci.lms.library.model.converter;

import com.npci.lms.library.model.type.Country;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class CountryConvter implements AttributeConverter<Country, String> {
    @Override
    public String convertToDatabaseColumn(Country country) {
        return country.getAlpha2();
    }

    @Override
    public Country convertToEntityAttribute(String country) {
        return Country.getInstanceAlpha2(country);
    }
}
