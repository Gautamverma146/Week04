package com.titWeek4Day2GautamCollectionFramework.QueueInterface.Problem05CircularBufferSimulation;



import java.util.Arrays;

public class CircularBufferSimulation {
    private int[] buffer;
    private int size;
    // Points to the oldest element
    private int front;
    // Points to the newest element
    private int rear;
    // To differentiate between full and empty states
    private boolean isFull;

    public CircularBufferSimulation(int capacity) {
        buffer = new int[capacity];
        size = 0;
        front = 0;
        rear = 0;
        isFull = false;
    }

    // Insert an element into the buffer (overwrite oldest if full)
    public void insert(int value) {
        buffer[rear] = value;
        rear = (rear + 1) % buffer.length;

        if (isFull) {
            front = (front + 1) % buffer.length;
        } else {
            size++;
        }

        // If the buffer is full after inserting
        isFull = (size == buffer.length);
    }

    // Display elements in the buffer
    public void display() {
        System.out.print("Buffer: [");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % buffer.length]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBufferSimulation cb = new CircularBufferSimulation(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        // Output: Buffer: [1, 2, 3]
        cb.display();
// Overwrites 1
        cb.insert(4);
        // Output: Buffer: [2, 3, 4]
        cb.display();
// Overwrites 2
        cb.insert(5);
        // Output: Buffer: [3, 4, 5]
        cb.display();
    }
}

