package com.tit.Week4Day4Gautam.ExceptionHandling.TryWithAutoClosingResource;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.*;

public class AutoClosingResource {
    //main method
    public static void main(String[] args) {
        // adding path of file
        String file = "C:/Gautam/Week-4/Day-4/ExceptionsHandling/src/main/java/com/tit/Week4Day4Gautam/ExceptionHandling/TryWithAutoClosingResource/sourseFile.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(file))){

            String line = br.readLine();

//printing first line of file
            if (line != null) {
                System.out.println("First line: " + line);
            } else {
                // Handle empty file case
                System.out.println("File is empty.");
            }
        }
        catch (IOException e){
            System.out.println("Error reading file");
        }
    }
}
