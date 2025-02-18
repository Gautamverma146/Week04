package com.tit.day06.reflection.basic_level.access_private_field;

import java.lang.reflect.Field;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        //create object of person
        Person rajveerPerson = new Person(20);

        //get class
        Class<?> classs = rajveerPerson.getClass();//get field
        try {
            //get field
            Field field = classs.getDeclaredField("age");

            field.setAccessible(true);

            //access field
            out.println("default age - " + field.get(rajveerPerson));

            //modify field value
            field.set(rajveerPerson, 25);

            //access field
            out.println("modified age - " + field.get(rajveerPerson));

        } catch (NoSuchFieldException e) {
            out.println("no field found");
        } catch (IllegalAccessException e) {
            out.println("field is not accessible");
        }
    }
}
