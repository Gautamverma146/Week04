package com.titWeek4Day3GautamStreams.ByteArrayStream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ImageToByteArray {

    public static void main(String[] args) throws IOException {
        String imagePath = "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/ByteArrayStream/wp11906238-cristiano-ronaldo-laptop-wallpapers.jpg"; // Replace with your image file path
        String newImagePath = "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/ByteArrayStream/outputImage.jpg";

        //  Convert image to byte array
        byte[] imageBytes = Files.readAllBytes(Paths.get(imagePath));

        //  Write byte array to a new image file
        try (ByteArrayInputStream bis = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(newImagePath)) {
// Buffer for reading/writing
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }

        // 3. Verify the images (optional but highly recommended)
        byte[] newImageBytes = Files.readAllBytes(Paths.get(newImagePath));

        if (Arrays.equals(imageBytes, newImageBytes)) {
            System.out.println("Images are identical!");
        } else {
            System.out.println("Images are different!");
        }
    }
}