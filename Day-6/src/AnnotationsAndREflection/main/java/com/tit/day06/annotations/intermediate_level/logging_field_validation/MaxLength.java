package com.tit.day06.annotations.intermediate_level.logging_field_validation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//custom annotation with value field
@Retention(RetentionPolicy.RUNTIME)
public @interface MaxLength{
    int value();
}
