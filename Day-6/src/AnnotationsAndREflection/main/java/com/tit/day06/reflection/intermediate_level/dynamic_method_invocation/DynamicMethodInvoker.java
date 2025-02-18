package com.tit.day06.reflection.intermediate_level.dynamic_method_invocation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

import static java.lang.System.out;

public class DynamicMethodInvoker {
    public static void main(String[] args) {
        //create object of MathOperations
        MathOperations mathOperations = new MathOperations();

        Class<?> mathOperationsClass = mathOperations.getClass();
        //get all methods
        Method[] methods = mathOperationsClass.getDeclaredMethods();
        //iterate all methods
        for(Method method : methods){
            try {
                Object result = method.invoke(mathOperations, 5,6);
                out.println("\noperation - " + method.getName() + ", result - " + result);
            } catch (IllegalAccessException | InvocationTargetException e) {
                out.println("can not invoke method");
            }
        }


    }
}
