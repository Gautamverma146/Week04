package com.tit.day06.reflection.basic_level.invoke_private_method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        //create object of calculator
        Calculator calculator = new Calculator();

        //get class
        Class<?> classs = calculator.getClass();


        try {
            //get private method
            Method method = classs.getDeclaredMethod("multiply", int.class, int.class);

            method.setAccessible(true);

            //access private method
            int result = (int) method.invoke(calculator, 2,3);

            //print result
            out.println("result - " + result);
        } catch (NoSuchMethodException e) {
            out.println("method not found");
        } catch (InvocationTargetException e) {
            out.println("can not invoke method");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
