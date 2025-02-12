package com.titWeek4Day2GautamCollectionFramework.SetInterface.Problem03SymmetricDifference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        //  two sets
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

        // Compute Symmetric Difference
        Set<Integer> symmetricDiffSet = new HashSet<>(set1);
        // Union of set1 and set2
        symmetricDiffSet.addAll(set2);

        // Find Intersection
        Set<Integer> intersectionSet = new HashSet<>(set1);
        // Common elements
        intersectionSet.retainAll(set2);

        // Remove intersection from symmetric difference
        symmetricDiffSet.removeAll(intersectionSet);

        // Printing  results
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Symmetric Difference: " + symmetricDiffSet);
    }
}
