package com.tit.day06.annotations.begineer_level.annotation_important;

public class ATMService {
    //method to withdraw cash
    @ImportantMethod
    public void withdrawCash() {
        System.out.println("Processing cash withdrawal");
    }

    //method to check balance
    @ImportantMethod(level = "LOW")
    public void checkBalance() {
        System.out.println("Checking account balance");
    }

    public void printReceipt() {
        System.out.println("Printing transaction receipt");
    }
}
