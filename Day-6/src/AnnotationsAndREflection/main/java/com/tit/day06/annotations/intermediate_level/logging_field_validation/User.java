package com.tit.day06.annotations.intermediate_level.logging_field_validation;

import java.lang.reflect.Field;

import static java.lang.System.out;

public class User {
    @MaxLength(10)
    private String username;

    //constructor
    public User(String username) {
        this.username = username;
        validate();
    }
    //method to validate username
    private void validate(){
        Class<User> userClass = User.class;
        //get field
        try {
            Field field = userClass.getDeclaredField("username");

            MaxLength annotation = field.getAnnotation(MaxLength.class);
            int maxLength = annotation.value();

            //check length
            if(username.length() > maxLength){
                throw new IllegalArgumentException(field.getName() + " length is greater than " + maxLength);
            }
            out.println("username is valid");
        } catch (NoSuchFieldException e) {
            out.println("field not found");
        }
    }
}
