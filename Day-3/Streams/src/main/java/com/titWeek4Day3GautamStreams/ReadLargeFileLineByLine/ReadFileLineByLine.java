package com.titWeek4Day3GautamStreams.ReadLargeFileLineByLine;

import java.io.*;

public class ReadFileLineByLine {

    public static void main(String[] args) throws IOException {
        String fileName = "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/ReadLargeFileLineByLine/largeFile.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            long lineNumber = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (line.toLowerCase().contains("error")) {
                    System.out.println("Line " + lineNumber + ": " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
