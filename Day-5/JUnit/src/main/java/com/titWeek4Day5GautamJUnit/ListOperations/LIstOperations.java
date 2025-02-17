package com.titWeek4Day5GautamJUnit.ListOperations;

import java.util.List;

public class LIstOperations {
    public static void addElement(List<Integer> list, int element) {
        if (list != null) {
            list.add(element);
        }
    }

    public static void removeElement(List<Integer> list, int element) {
        if (list != null) {
            list.remove(Integer.valueOf(element)); // Removes the first occurrence
        }
    }

    public static int getSize(List<Integer> list) {
        return (list != null) ? list.size() : 0;
    }
}
