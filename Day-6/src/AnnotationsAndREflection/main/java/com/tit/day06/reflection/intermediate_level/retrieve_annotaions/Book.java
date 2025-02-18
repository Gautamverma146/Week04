package com.tit.day06.reflection.intermediate_level.retrieve_annotaions;

//add annotation to class
@Author(name = "Rajveer")
public class Book{
    //attribute
    private String title;

    //constructor
    public Book(String title) {
        this.title = title;
    }
}
