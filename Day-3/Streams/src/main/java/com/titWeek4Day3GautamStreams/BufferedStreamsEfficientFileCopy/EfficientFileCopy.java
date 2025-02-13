package com.titWeek4Day3GautamStreams.BufferedStreamsEfficientFileCopy;

import java.io.*;
import java.util.*;

public class EfficientFileCopy {
    public static void main(String[] args) {
        String sourceFile =  "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/BufferedStreamsEfficientFileCopy/sourse.txt";
        ;  // Source file path
        String bufferedCopy = "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/BufferedStreamsEfficientFileCopy/buffer.txt";
        String normalCopy = "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/BufferedStreamsEfficientFileCopy/Normal.txt";

        // Copy using Buffered Streams
        long bufferedTime = copyUsingBufferStreams(sourceFile, bufferedCopy);
        System.out.println("Buffered Copy Time: " + bufferedTime + " nanoseconds");

        // Copy using Normal Streams
        long normalTime = copyUsingNormalStreams(sourceFile, normalCopy);
        System.out.println("Normal Copy Time: " + normalTime + " nanoseconds");

        // Compare Performance
        System.out.println("Buffered is " + (normalTime / (double) bufferedTime) + " times faster!");
    }
    public static long copyUsingBufferStreams( String source, String destination) {
       long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1){
                bos.write(bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        long endTime = System.nanoTime();
        return endTime-startTime;
    }
    //method to copy file using normal streams
    public static long copyUsingNormalStreams(String source, String destination){
        long startTime = System.nanoTime();
        try(FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(destination)){
            byte[] buffer = new byte[4096];
            int bytesRead;
            while((bytesRead = fis.read(buffer)) != -1){
                fos.write(bytesRead);
            }

        }
        catch (IOException e){
            System.out.println("Error"+ e.getMessage());
        }
        long endTime = System.nanoTime();
        return endTime-startTime;
    }
}

