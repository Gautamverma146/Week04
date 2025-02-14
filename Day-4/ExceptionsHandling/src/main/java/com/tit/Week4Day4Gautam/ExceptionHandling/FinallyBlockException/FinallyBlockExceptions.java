package com.tit.Week4Day4Gautam.ExceptionHandling.FinallyBlockException;

import java.util.Scanner;

public class FinallyBlockExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter first number ");
            int num1 = sc.nextInt();
            System.out.println("Enter Second number");
            int num2 = sc.nextInt();

            int result = num1/num2;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Error: divide by zero is not allowed");
        }
        finally {
            System.out.println("Operation completed");
        }
    }

}
