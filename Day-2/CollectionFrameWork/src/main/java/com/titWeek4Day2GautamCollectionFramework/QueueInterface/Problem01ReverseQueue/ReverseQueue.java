package com.titWeek4Day2GautamCollectionFramework.QueueInterface.Problem01ReverseQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        //  Dequeue all elements and push into stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        //  Pop all elements from stack and enqueue back
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        //displaying reverse queue
        System.out.println("Reversed Queue: " + queue);
    }
}

