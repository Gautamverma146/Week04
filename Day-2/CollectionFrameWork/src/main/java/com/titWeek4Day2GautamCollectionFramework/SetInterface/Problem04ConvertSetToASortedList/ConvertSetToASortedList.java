package com.titWeek4Day2GautamCollectionFramework.SetInterface.Problem04ConvertSetToASortedList;

import java.util.*;

public class ConvertSetToASortedList {
    public static void main(String[] args) {
        //initializing Set
        Set<Integer> numberSet = new HashSet<>();
        //adding values to set
        numberSet.add(5);
        numberSet.add(2);
        numberSet.add(1);
        numberSet.add(3);
        numberSet.add(4);

//convert hashset to sorted list
        List<Integer> numberList = new ArrayList<>(numberSet);

        Collections.sort(numberList);
        System.out.println("Sorted List: ");
        System.out.println(numberList);

    }
}
