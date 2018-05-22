package com.npci.lms.library.model.converter;

import com.npci.lms.library.model.type.ProductPackageType;

import javax.persistence.AttributeConverter;

public class ProductPackageTypeConverter implements AttributeConverter<ProductPackageType, String> {
    @Override
    public String convertToDatabaseColumn(ProductPackageType packageType) {
        return packageType.getType();
    }

    @Override
    public ProductPackageType convertToEntityAttribute(String packageType) {
        return ProductPackageType.getInstance(packageType);
    }
}
