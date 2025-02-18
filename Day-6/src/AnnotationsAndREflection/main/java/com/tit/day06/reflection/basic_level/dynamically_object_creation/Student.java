package com.tit.day06.reflection.basic_level.dynamically_object_creation;

import static java.lang.System.out;

public class Student {
    //attribute
    private String name;

    //constructor
    public Student(String name) {
        this.name = name;
    }
    //method to display name
    public void displayName() {
        out.println("Student name " + name);
    }

}
