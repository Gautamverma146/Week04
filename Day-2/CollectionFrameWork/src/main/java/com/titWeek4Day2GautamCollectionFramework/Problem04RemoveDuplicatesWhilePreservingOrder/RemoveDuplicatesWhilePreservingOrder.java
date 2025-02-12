package com.titWeek4Day2GautamCollectionFramework.Problem04RemoveDuplicatesWhilePreservingOrder;
//importing java utility
import java.util.*;

public class RemoveDuplicatesWhilePreservingOrder {
    //method for removing duplicate element in list using hashset
    public static List<Integer> removeDuplicates(List<Integer> list){
        Set<Integer> setSeen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int num : list){
            if(setSeen.add(num)){
                result.add(num);
            }
        }
        return result;
    }
//main method to test methods
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(3,1,2,2,3,4);
        List<Integer> onlyUniqueNumber = removeDuplicates(numbersList);

        System.out.println("Given number list"+ numbersList);
        System.out.println();
        //displaying list after removing duplicates
        System.out.println("After Removing Duplicates"+ onlyUniqueNumber);
    }
}
