package com.titWeek4Day3GautamStreams.ReadUserInputFromConsole;

import java.io.*;

public class ReadUserInputFromConsole {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/ReadUserInputFromConsole/userInputSave.txt"; // Name of the file to save data

        try (FileWriter writer = new FileWriter(fileName)) {

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            // Parse age as an integer
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write the data to the file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            System.out.println("User data saved to " + fileName);

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid age entered. Please enter a number.");
        }
    }
}
