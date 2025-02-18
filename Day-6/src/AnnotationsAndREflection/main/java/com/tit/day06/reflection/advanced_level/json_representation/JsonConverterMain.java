package com.tit.day06.reflection.advanced_level.json_representation;

public class JsonConverterMain {
    public static void main(String[] args) {
        //create user object
        User user = new User("Rajveer", 19, "male");
        //create Json convert object
        JsonConverter jsonConverter = new JsonConverter();
        String json = jsonConverter.toJson(user);

        System.out.println(json);
    }
}
