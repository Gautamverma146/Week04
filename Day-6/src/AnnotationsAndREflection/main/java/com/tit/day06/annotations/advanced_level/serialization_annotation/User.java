package com.tit.week04.day06.annotations.advanced_level.serialization_annotation;

import com.tit.day06.annotations.advanced_level.serialization_annotation.JsonField;

public class User {
    //Attributes
    @JsonField(name = "user_name")
    private String name;
    @JsonField(name = "user_id")
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
