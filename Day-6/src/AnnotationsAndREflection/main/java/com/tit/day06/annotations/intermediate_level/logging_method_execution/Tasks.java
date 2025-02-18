package com.tit.day06.annotations.intermediate_level.logging_method_execution;

import static java.lang.System.out;

public class Tasks {
    //method with custom annotations
    @LogExecutionTime
    public void firstTask(){
        out.println("first task executing");
    }

    @LogExecutionTime
    public void secondTask(){
        out.println("second task executing");
    }
}
