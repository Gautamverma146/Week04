package com.titWeek4Day2GautamCollectionFramework.QueueInterface.Problem04ImplementAStackUsingQueues;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push operation (O(1))
    public void push(int x) {
        q1.offer(x); // Add element to the main queue
    }

    // Pop operation (O(N))
    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }

        // Move all elements except the last to q2
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        // Remove and return the last element (top of stack)
        int topElement = q1.poll();

        // Swap q1 and q2
        swapQueues();

        return topElement;
    }

    // Top operation (O(N))
    public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot fetch top.");
        }

        // Move all elements except the last to q2
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        // Peek at the last element (top of stack)
        int topElement = q1.peek();

        // Move the last element to q2
        q2.offer(q1.poll());

        // Swap q1 and q2
        swapQueues();

        return topElement;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    // Swap q1 and q2
    private void swapQueues() {
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public static void main(String[] args) {
        StackUsingTwoQueues stack = new StackUsingTwoQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top()); // Output: 3
        System.out.println("Pop: " + stack.pop()); // Output: 3
        System.out.println("Top: " + stack.top()); // Output: 2
    }
}
