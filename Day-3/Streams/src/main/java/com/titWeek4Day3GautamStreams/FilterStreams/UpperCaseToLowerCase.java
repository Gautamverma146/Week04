package com.titWeek4Day3GautamStreams.FilterStreams;

import java.io.*;

public class UpperCaseToLowerCase {

    public static void main(String[] args) throws IOException {
        String inputFile = "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/FilterStreams/input.txt";   // Replace with your input file path
        String outputFile = "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/FilterStreams/output.txt"; // Replace with your desired output file path

        try (FileReader fr = new FileReader(inputFile);
             FileWriter fw = new FileWriter(outputFile);
             BufferedReader br = new BufferedReader(fr);
             BufferedWriter bw = new BufferedWriter(fw)) {

            int c;
            // Read character by character
            while ((c = br.read()) != -1) {
                if (Character.isUpperCase(c)) {
                    // Convert to lowercase
                    c = Character.toLowerCase(c);
                }
                // Write the character (converted or original)
                bw.write(c);
            }

            System.out.println("File processed successfully!");

        } catch (FileNotFoundException e) {
            System.err.println("Input file not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
