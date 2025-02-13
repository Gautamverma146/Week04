package com.titWeek4Day3GautamStreams.ReadAndWriteTextFiles;
//"C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/ReadAndWriteTextFiles/exFile.txt";
import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        String sourceFile = "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/ReadAndWriteTextFiles/exFile.txt";  // Input file name
        String destinationFile = "destination.txt";  // Output file name

        // Read from source and write to destination
        if (copyFile(sourceFile, destinationFile)) {
            System.out.println("\nContents of the copied file:");
            printFile(destinationFile);
        }
    }

    public static boolean copyFile(String sourceFile, String destinationFile) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Open source file for reading
            File inputFile = new File(sourceFile);
            if (!inputFile.exists()) {
                System.out.println("Error: Source file does not exist!");
                return false;
            }

            fis = new FileInputStream(inputFile);
            fos = new FileOutputStream(destinationFile); // Creates file if not exists

            // Buffer to read and write data
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");
            return true; // Copy successful

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
            return false;
        } finally {
            try {
                if (fis != null) fis.close(); // Close FileInputStream
                if (fos != null) fos.close(); // Close FileOutputStream
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }

    public static void printFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
