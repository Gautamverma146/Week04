package com.titWeek4Day2GautamCollectionFramework.MapInterface.InverAMap;import java.util.*;

public class InvertMap {
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> originalMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            // If value is already in invertedMap, add key to existing list
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return invertedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);
        originalMap.put("D", 3);
        originalMap.put("E", 2);

        System.out.println("Original Map: " + originalMap);
        Map<Integer, List<String>> invertedMap = invertMap(originalMap);
        System.out.println("Inverted Map: " + invertedMap);
    }
}

