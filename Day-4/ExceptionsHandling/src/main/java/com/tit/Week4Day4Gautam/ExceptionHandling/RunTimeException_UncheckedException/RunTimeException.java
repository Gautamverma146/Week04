package com.tit.Week4Day4Gautam.ExceptionHandling.RunTimeException_UncheckedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunTimeException {
    //main method
    public static void main(String[] args) {
        //input class
        Scanner sc = new Scanner(System.in);
        try{
            //asking for input num1
            System.out.println("Enter First Number");
            int num1 = sc.nextInt();
            //asking for input num2
            System.out.println("Enter Second Number");
            int num2 = sc.nextInt();
            //divide num1 with num2
            int resultAfterDivide = num1/num2;
            System.out.println(resultAfterDivide);
        }
        catch (ArithmeticException e){
            System.out.println("Error: divide by zero is not allowed");
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }

    }
}
