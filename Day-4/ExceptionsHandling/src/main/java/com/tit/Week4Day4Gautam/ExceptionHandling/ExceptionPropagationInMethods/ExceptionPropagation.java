package com.tit.Week4Day4Gautam.ExceptionHandling.ExceptionPropagationInMethods;

public class ExceptionPropagation {

    public static void main(String[] args) {
        try {
            // Call method2, which can propagate the exception
            method2();
        } catch (ArithmeticException e) {
            // Handle the exception in main
            System.out.println("Handled exception in main");
        }
    }

    public static void method2() {
        // Call method1, which can throw the exception
        method1();
    }

    public static void method1() {
        int result = 10 / 0;
        // This will throw an ArithmeticException
    }
}
