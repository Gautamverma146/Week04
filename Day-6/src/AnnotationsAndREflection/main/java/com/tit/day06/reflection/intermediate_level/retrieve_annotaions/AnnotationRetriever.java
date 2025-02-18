package com.tit.day06.reflection.intermediate_level.retrieve_annotaions;

import static java.lang.System.out;

public class AnnotationRetriever{
    public static void main(String[] args) {
        //create a book
        Book book = new Book("sunshine");

        Class<?> bookClass = book.getClass();

        //get annotation
        Author annotation = bookClass.getAnnotation(Author.class);
        //print annotation
        out.println("annotation name - " +annotation.name());
    }
}
