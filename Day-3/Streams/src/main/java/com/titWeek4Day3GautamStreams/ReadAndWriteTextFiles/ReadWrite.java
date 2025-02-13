package com.titWeek4Day3GautamStreams.ReadAndWriteTextFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class ReadWrite {

    public static void main(String[] args) {
        String sourceFileName = "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/ReadAndWriteTextFiles/exFile.txt"; // Replace with your source file name
        String destinationFileName = "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/ReadAndWriteTextFiles/destination.txt"; // Replace with your desired destination file name

        try {
            File sourceFile = new File(sourceFileName);

            if (!sourceFile.exists()) {
                System.out.println("Source file '" + sourceFileName + "' does not exist.");
                return;
                // Exit the program if the source file doesn't exist.
            }
// Creates the file if it doesn't exist
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFileName);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully from \n" + sourceFileName + "' to \n'" + destinationFileName + "'.");

        } catch (IOException e) {
            System.err.println("An error occurred during file processing: " + e.getMessage());
        }
    }
}