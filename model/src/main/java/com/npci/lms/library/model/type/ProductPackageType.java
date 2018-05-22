package com.npci.lms.library.model.type;

import com.npci.lms.library.model.exception.TypeNotFoundException;

import java.text.MessageFormat;

public enum ProductPackageType {
    PIECE(1, "C", "Piece"),
    PACKET(2, "P", "Packet", "First package"),
    BOX(3, "B", "Box", "Second package"),
    PALLET(4, "L", "Pallet");

    private final int value;
    private final String type;
    private final String name;
    private final String description;
    private final int length = 1;

    ProductPackageType(int value, String type, String name, String description) {
        this.value = value;
        this.type = type;
        this.name = name;
        this.description = description;
        // this.length = 3;
    }

    ProductPackageType(int value, String type, String name) {
        this(value, type, name, "");
    }

    public static ProductPackageType getInstance(int value) {
        for (ProductPackageType packageType : values())
            if (packageType.getValue() == value)
                return packageType;

        throw new TypeNotFoundException(MessageFormat.format("Could not create {0} for [{1}]", ProductPackageType.class.getName(), value));
    }

    public static ProductPackageType getInstance(String value) {
        if (value == null || value.isEmpty())
            return null;

        for (ProductPackageType packageType : values())
            if (packageType.getType().equals(value))
                return packageType;

        throw new TypeNotFoundException(MessageFormat.format("Could not create {0} for [{1}]", ProductPackageType.class.getName(), value));
    }

    public int getValue() {
        return value;
    }

    public int getInteger() {
        return value;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getString() {
        // return ISOUtil.zeropad(value, length);
        return String.format("%01d", value);
    }

    public String getDescription() {
        return description;
    }
}

