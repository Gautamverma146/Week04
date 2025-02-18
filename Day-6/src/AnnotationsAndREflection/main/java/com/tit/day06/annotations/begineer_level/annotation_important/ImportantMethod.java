package com.tit.day06.annotations.begineer_level.annotation_important;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ImportantMethod {
    String level() default "HIGH";
}