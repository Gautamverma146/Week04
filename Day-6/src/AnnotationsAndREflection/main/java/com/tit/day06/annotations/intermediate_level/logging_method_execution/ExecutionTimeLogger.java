package com.tit.day06.annotations.intermediate_level.logging_method_execution;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.System.out;

public class ExecutionTimeLogger{
    public static void main(String[] args) {
        Tasks tasks = new Tasks();

        Class<?> tasksClass = tasks.getClass();

        //get all methods
        Method[] methods = tasksClass.getDeclaredMethods();

        //iterate all methods
        for(Method method : methods){
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                try {
                    method.invoke(tasks); // invoke the method
                } catch (IllegalAccessException | InvocationTargetException e) {
                    out.println("can not invoke method");
                }
                long end = System.nanoTime();

                out.println(method.getName() + " executed in " + (end - start) + " nanoseconds\n");
            }
        }

    }
}
