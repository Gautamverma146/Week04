package com.titWeek4Day2GautamCollectionFramework.SetInterface.Problem02UnionAndIntersectionOfTwoSets;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionOfTwoSets{
    public static void main(String[] args) {
        // Define two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to Set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Add elements to Set2
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Compute Union
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        // Compute Intersection
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);

        // Print results
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }
}

