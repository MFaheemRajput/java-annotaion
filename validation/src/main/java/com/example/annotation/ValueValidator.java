package com.example.annotation;

import java.lang.reflect.Field;

public class ValueValidator {
    public static void validate(Object obj) throws Exception {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ValidateRange.class)) {
                field.setAccessible(true);
                int value = field.getInt(obj);
                ValidateRange range = field.getAnnotation(ValidateRange.class);
                if (value < range.min() || value > range.max()) {
                    throw new IllegalArgumentException("Invalid value: " + value);
                }
            }
        }
    }
}
