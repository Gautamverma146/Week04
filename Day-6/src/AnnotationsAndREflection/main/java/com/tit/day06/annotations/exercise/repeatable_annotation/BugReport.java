package com.tit.day06.annotations.exercise.repeatable_annotation;


import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//annotation bug report
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReportContainer.class)
public @interface BugReport {
    String description();
}
