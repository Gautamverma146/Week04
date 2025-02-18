package com.tit.day06.annotations.advanced_level.serialization_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
//custom annotation
public @interface JsonField {
    String name();
}
