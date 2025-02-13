package com.titWeek4Day2GautamCollectionFramework.MapInterface.MergeTwoMaps;

import java.util.Map;
import java.util.HashMap;

public class MergeTwoMaps {
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        // Copy all elements from map1
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return mergedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> result = mergeMaps(map1, map2);
        // Output: {A=1, B=5, C=4}
        System.out.println(result);
        // Output: {A=1, B=5, C=4}
    }
}

