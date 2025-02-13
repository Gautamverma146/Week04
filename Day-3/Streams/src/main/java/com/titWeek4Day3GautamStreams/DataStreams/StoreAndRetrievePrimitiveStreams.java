package com.titWeek4Day3GautamStreams.DataStreams;

import java.io.*;

public class StoreAndRetrievePrimitiveStreams {

    public static void main(String[] args) {
        String fileName =  "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/DataStreams/student.txt"; // Binary file to store data

        // Store student data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            // Sample student data (you can add more students)
            dos.writeInt(123);
            dos.writeUTF("Verma");
            dos.writeDouble(3.8);

            dos.writeInt(456);
            dos.writeUTF("Gautam");
            dos.writeDouble(3.5);

            System.out.println("Student data stored in " + fileName);

        } catch (IOException e) {
            System.err.println("Error writing student data: " + e.getMessage());
        }

        // Retrieve student data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {

            System.out.println("\nRetrieved student data:");
            while (true) { // Read until EOFException is thrown
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }

        } catch (EOFException e) {
            // End of file reached
            System.out.println("End of file reached.");
        } catch (IOException e) {
            System.err.println("Error reading student data: " + e.getMessage());
        }
    }
}
