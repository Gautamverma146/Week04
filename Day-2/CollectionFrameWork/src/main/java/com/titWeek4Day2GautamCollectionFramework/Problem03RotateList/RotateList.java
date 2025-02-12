package com.titWeek4Day2GautamCollectionFramework.Problem03RotateList;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
    public static void reverse(List<Integer> list, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }

    public static void rotate(List<Integer> list, int k) {
        int n = list.size();
        // No rotation needed if k is invalid
        if (k <= 0 || k >= n) return;

        //  Reverse the entire list
        reverse(list, 0, n - 1);

        // Reverse the first k elements
        reverse(list, 0, k - 1);

        //  Reverse the remaining elements
        reverse(list, k, n - 1);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //displaying original list
        System.out.println("Original List: "+ list);
        int ratateBy = 2;
        // Rotate left by 3 positions
        int k = ratateBy + 1;

        rotate(list, k);
//displaying list after rotation
        System.out.println("Rotated List: " + list);
    }
}
