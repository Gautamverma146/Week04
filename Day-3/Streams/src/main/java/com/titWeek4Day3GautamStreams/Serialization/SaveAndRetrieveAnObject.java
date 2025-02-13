package com.titWeek4Day3GautamStreams.Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

public class SaveAndRetrieveAnObject {

    public static void main(String[] args) {
        String fileName = "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/Serialization/file1.txt"; // File to store employee data

        // Create some sample employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "Sales", 60000));
        employees.add(new Employee(2, "Bob", "Marketing", 70000));
        employees.add(new Employee(3, "Charlie", "Engineering", 80000));

        // Serialize the employee list to the file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employees);
            System.out.println("Employee data serialized and saved to " + fileName);
        } catch (IOException e) {
            System.err.println("Error serializing employee data: " + e.getMessage());
        }

        // Deserialize and display the employees from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Employee> retrievedEmployees = (List<Employee>) ois.readObject();

            System.out.println("\nRetrieved employee data:");
            for (Employee emp : retrievedEmployees) {
                System.out.println(emp);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error deserializing employee data: " + e.getMessage());
        }
    }
}