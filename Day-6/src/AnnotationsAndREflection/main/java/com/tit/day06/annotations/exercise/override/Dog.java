package com.tit.day06.annotations.exercise.override;

import static java.lang.System.out;

public class Dog extends Animal{
    //override make sound method
    @Override
    public void makeSound() {
        out.println("Dog barks");
    }
}
