package com.tit.day06.reflection.basic_level.dynamically_object_creation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Class<?> studentClass = Student.class;
        //get constructor
        try {
            Constructor<?> constructor = studentClass.getConstructor(String.class);

            //create student object
            Student rajveerStudent = (Student) constructor.newInstance("Rajveer");

            //diplsy name
            rajveerStudent.displayName();
        } catch (NoSuchMethodException e) {
            out.println("no constructor found");
        } catch (InvocationTargetException e) {
            out.println("exception occurred while invoking the method");
        } catch (InstantiationException e) {
            out.println("Could not instantiate the class");
        } catch (IllegalAccessException e) {
            out.println("Illegal access");
        }
    }
}
