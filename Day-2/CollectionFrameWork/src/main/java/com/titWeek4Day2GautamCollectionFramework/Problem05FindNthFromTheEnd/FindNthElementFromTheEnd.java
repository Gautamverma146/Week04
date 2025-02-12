package com.titWeek4Day2GautamCollectionFramework.Problem05FindNthFromTheEnd;
//Importing java utility
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import static java.util.Collections.list;

public class FindNthElementFromTheEnd {
    //method to find Nth Element from the End of list
    public static String findNthElement(List<String> list , int N){
        if(list == null || list.isEmpty() || N <= 0  ){
            return "Invalid input";

        }
        ListIterator<String> p1 = list.listIterator();
        ListIterator<String> p2 = list.listIterator();

        for( int i =0; i< N; i++){
            if(!p1.hasNext()){
                return "N is larger than the list";
            }
            p1.next();
        }
        while (p1.hasNext()){
            p1.next();
            p2.next();
        }
        return "Nth Element from the end is  " + p2.next();
    }
//main method
    public static void main(String[] args) {
        //initializing Linked list using collection
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        // target Nth is D
        int N = 2;
        //Displaying Nth element
        System.out.println(findNthElement(list,N));
    }
}
