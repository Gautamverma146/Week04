package com.titWeek4Day2GautamCollectionFramework.SetInterface.Problem01CheckIfTwoSetsAreEqual;

import java.util.HashSet;
import java.util.Set;

public class CheckTwoSetsAreEqual {
    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        // Directly compares sets
        return set1.equals(set2);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding elements to sets
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(2);
        set2.add(1);

        // Check equality
        System.out.println("Are sets equal? " + areSetsEqual(set1, set2));
        // Output: true
    }
}

