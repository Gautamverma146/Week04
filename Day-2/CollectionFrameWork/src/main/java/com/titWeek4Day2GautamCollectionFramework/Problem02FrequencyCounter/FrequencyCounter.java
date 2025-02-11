package com.titWeek4Day2GautamCollectionFramework.Problem02FrequencyCounter;

import java.util.*;

public class FrequencyCounter {
    public static Map<String, Integer> findFrequency(List<String> elements) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String element : elements) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> frequencyResult = findFrequency(inputList);

        System.out.println("Element Frequencies: " + frequencyResult);
    }
}
