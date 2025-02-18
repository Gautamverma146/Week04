package com.tit.day06.reflection.advanced_level.method_execution_timing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import static java.lang.System.out;

public class MethodExecutionTimer {
    public static void main(String[] args) {
        //create object of taks
        Task task = new Task();

        Class<?> taskClass = task.getClass();

        //get all method
        Method[] methods = taskClass.getDeclaredMethods();

        for (Method method : methods){
            try {
                //calculate time
                long startTime = System.nanoTime();
                method.invoke(task);
                long endTime = System.nanoTime();

                long totalTime  = endTime - startTime;

                out.println("execution time of " + method.getName() + "- " + totalTime/1e9 + " ns");
            } catch (IllegalAccessException | InvocationTargetException e) {
                out.println("can not invoke method");
            }
        }
    }
}
