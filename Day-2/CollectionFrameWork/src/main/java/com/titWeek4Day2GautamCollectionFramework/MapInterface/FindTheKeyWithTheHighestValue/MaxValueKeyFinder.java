package com.titWeek4Day2GautamCollectionFramework.MapInterface.FindTheKeyWithTheHighestValue;

import java.util.Map;
import java.util.HashMap;

public class MaxValueKeyFinder {
    public static String findMaxValueKey(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return "Map is empty";
        }

        String maxKey = null;
        // Start with the smallest possible value
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
// Return the key with the highest value
        return maxKey;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        System.out.println("Key with max value: " + findMaxValueKey(map));
        // Output: B
    }
}
