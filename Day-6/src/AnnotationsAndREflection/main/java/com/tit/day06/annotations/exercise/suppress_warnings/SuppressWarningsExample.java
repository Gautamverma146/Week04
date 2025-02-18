package com.tit.day06.annotations.exercise.suppress_warnings;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsExample {
    //attribute
    private List list;
    //constructor
    public SuppressWarningsExample(){
        list = new ArrayList();
    }

    @SuppressWarnings("unchecked")
    //method to add element
    public void addElement(int element){
        list.add(element);
    }
}
