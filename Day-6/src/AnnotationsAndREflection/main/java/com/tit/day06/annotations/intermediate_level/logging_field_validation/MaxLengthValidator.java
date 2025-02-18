package com.tit.day06.annotations.intermediate_level.logging_field_validation;

import static java.lang.System.out;

public class MaxLengthValidator{
    public static void main(String[] args) {
        try{
            //create object of user class
            User rajUser = new User("Rajveer");

            User veerUser = new User("Rajveer Kajle");
        }catch (IllegalArgumentException e){
            out.println(e.getMessage());
        }
    }
}
