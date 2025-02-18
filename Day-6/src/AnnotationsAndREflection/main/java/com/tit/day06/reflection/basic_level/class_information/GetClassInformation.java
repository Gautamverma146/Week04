package com.tit.day06.reflection.basic_level.class_information;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

import static java.lang.System.out;

public class GetClassInformation{
    //method to display methods
    private static void displayMethod(Class<?> classs) {
        Method[] methods = classs.getDeclaredMethods();
        //print method
        out.println("methods - ");
        for(Method method : methods){
            out.println(method.getName());
        }
    }
    //method to display fields
    private static void displayField(Class<?> classs) {
        Field[] fields = classs.getDeclaredFields();
        //print fields
        out.println("\nfields - ");
        for(Field field : fields){
            out.println(field.getName());
        }
    }
    //display constructor
    private static void displayConstructor(Class<?> classs) {
        Constructor<?>[] constructors = classs.getDeclaredConstructors();
        //print constructor
        out.println("\nconstructors - ");
        for(Constructor<?> constructor : constructors){
            out.println(constructor.getName());
        }
    }
    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new Scanner(System.in);
        //input class name from user
        out.println("enter class name with package");
        String className = input.next();

        //get class informatation
        try {
            //get class informatation
            Class<?> classs = Class.forName(className);

            //display methods
            displayMethod(classs);
            //display fields
            displayField(classs);
            //display constructor
            displayConstructor(classs);
        } catch (ClassNotFoundException e) {
            out.println("class not found");
        }
    }
}
