package com.tit.day06.annotations.exercise.repeatable_annotation;

import static java.lang.System.out;

public class Project {
    //method with multiple bug
    @BugReport(description = "array index out of bound exception")
    @BugReport(description = "file not found exception")
    public void buggyCode(){
        out.println("this code contain multiple bug");
    }
}
