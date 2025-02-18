package com.tit.day06.annotations.exercise.repeatable_annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface BugReportContainer {
    BugReport[] value();
}
