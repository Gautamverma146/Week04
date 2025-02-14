package com.tit.Week4Day4Gautam.ExceptionHandling.CheckedException_CompileTimeExceptions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeExceptionHandling {
    //main method

    public static void main(String[] args) {
        //we are not providing path of file expecting error file not found
        String file = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            //reading line by line
            while (br.ready()){
                br.readLine();

            }
        }
        catch (IOException e){
            //handling exception
            System.out.println("Exception handled "+ "File Not Found");
            System.out.println(e.getMessage());
        }
    }
}
