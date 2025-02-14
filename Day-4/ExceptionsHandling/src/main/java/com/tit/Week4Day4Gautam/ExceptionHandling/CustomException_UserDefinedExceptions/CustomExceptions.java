package com.tit.Week4Day4Gautam.ExceptionHandling.CustomException_UserDefinedExceptions;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends Exception{
    //extending Exception class to make custom Exception InvalidAgeException
    public InvalidAgeException(String message){
        super(message);
    }
}
public class CustomExceptions {
    //Method to validate age
    //throwing exception
    public static void validateAge (int age) throws InvalidAgeException{
        if( age < 18){
            throw new InvalidAgeException("Age must be 18 or above");
        }

    }
//main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Checking if age is invalid
        try{
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            validateAge(age);

            System.out.println("Access Granted!");
        }
        //Exception handling
        catch (InvalidAgeException e){
            System.out.println("Error " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input ");
        }
    }

}
