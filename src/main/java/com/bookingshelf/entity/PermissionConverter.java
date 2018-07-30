package com.bookingshelf.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class PermissionConverter implements AttributeConverter<Permission, String>{

    public String convertToDatabaseColumn(Permission value) {
        if ( value == null ) {
            return null;
        }

        return value.getCode();
    }

    public Permission convertToEntityAttribute(String value) {
        if ( value == null ) {
            return null;
        }

        return Permission.fromCode(value);
    }
}
