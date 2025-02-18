package com.tit.day06.annotations.exercise.custom_annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TaskInfo{
    int priority() default 1;
    String assignTo() default  "unassigned";
}
