package com.tit.day06.reflection.advanced_level.custom_object_manner;

import java.util.HashMap;
import java.util.Map;
import static java.lang.System.out;

public class ObjectMapperMain {
    public static void main(String[] args) {
        //create map to store field and value
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Rajveer");
        properties.put("age", 19);

        //convert map to object
        User user = ObjectMapper.toObject(User.class, properties);
        //print user
        out.println("name - " + user.getName() +
                "\nage - "+ user.getAge());
    }
}
