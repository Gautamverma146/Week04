package com.tit.Week4Day4Gautam.ExceptionHandling.ThrowVsThrows;

public class ThrowVsThrowsExceptionPropogation {
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
        if(amount <0 || rate < 0 || years < 1){
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        else{

        }
        return (amount * 100) / (100 + (rate * years));
    }
    public static void main(String[] args) {
     double amount = 1000000.0;
     double rate  = 14;
     int year = 5;
     try{
         double interest = calculateInterest(amount,rate,year);
         System.out.println("The Interest is: "+ interest);
     }
     catch (IllegalArgumentException e){
         System.out.println( "Invalid input: Amount and rate must be positive");
     }
    }
}
