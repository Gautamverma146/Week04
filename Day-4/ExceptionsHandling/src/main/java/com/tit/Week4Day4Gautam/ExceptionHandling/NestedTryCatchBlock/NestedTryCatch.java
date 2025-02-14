package com.tit.Week4Day4Gautam.ExceptionHandling.NestedTryCatchBlock;

import java.util.Scanner;

public class NestedTryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Example array (you can modify)
            int[] arr = {10, 20, 30};

            System.out.print("Enter the index: ");
            int index = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            try {
                // Inner try block for division
                int element = arr[index];
                // Access the element (might throw ArrayIndexOutOfBoundsException)
                int result = element / divisor;
                // Divide (might throw ArithmeticException)
                System.out.println("Result of division: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } finally {
            System.out.println("Operation Complete");
        }
    }
}