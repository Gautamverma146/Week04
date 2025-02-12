package com.titWeek4Day2GautamCollectionFramework.QueueInterface.Problem02GenrateBinaryNumberUsingQueue;



import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumberUsingQueue {
    public static void generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1"); // First binary number

        for (int i = 0; i < N; i++) {
            String binary = queue.remove();
            System.out.print(binary + " "); // Print the current binary number

            // Append "0" and enqueue
            queue.add(binary + "0");
            // Append "1" and enqueue
            queue.add(binary + "1");
        }
    }

    public static void main(String[] args) {
        // Generate first 5 binary numbers
        int N = 5;
        System.out.println("First " + N + " Binary Numbers:");
        generateBinaryNumbers(N);
    }
}
