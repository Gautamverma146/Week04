package com.titWeek4Day3GautamStreams.PipedStreams;

import java.io.*;

public class InterThreadCommunication {

    public static void main(String[] args) throws IOException {

        PipedOutputStream out = new PipedOutputStream();
        // Connect input to output
        PipedInputStream in = new PipedInputStream(out);

        // Writer thread
        Thread writerThread = new Thread(() -> {
            try (out) { // try-with-resources
                String message = "Hello from the writer thread!";
                out.write(message.getBytes());
                System.out.println("Writer thread: Message sent.");
            } catch (IOException e) {
                System.err.println("Writer thread: Error: " + e.getMessage());
            }
        });

        // Reader thread
        Thread readerThread = new Thread(() -> {
            try (in) { // try-with-resources
                byte[] buffer = new byte[1024];
                int bytesRead = in.read(buffer);
                String receivedMessage = new String(buffer, 0, bytesRead);
                System.out.println("Reader thread: Message received: " + receivedMessage);
            } catch (IOException e) {
                System.err.println("Reader thread: Error: " + e.getMessage());
            }
        });

        writerThread.start();
        readerThread.start();

        try {
            writerThread.join(); // Wait for writer to finish
            readerThread.join(); // Wait for reader to finish
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted: " + e.getMessage());
        }
    }
}
