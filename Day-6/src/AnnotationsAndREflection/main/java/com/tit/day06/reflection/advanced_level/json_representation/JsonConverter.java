package com.tit.day06.reflection.advanced_level.json_representation;

import java.lang.reflect.Field;

import static java.lang.System.out;

public class JsonConverter {
    //method to convert object to json representation
    public String toJson(User object){
        //stringbuilder to store json representation
        StringBuilder json = new StringBuilder();
        json.append("{");

        Class<?> clazz = object.getClass();
        //get field
        Field[] fields = clazz.getDeclaredFields();

        for(Field field : fields){
            field.setAccessible(true);
            try {
                //get field name and value
                String fieldName = field.getName();
                Object fieldValue = field.get(object);
                //append values to string builder
                json.append("\"").append(fieldName).append("\":\"")
                        .append(fieldValue).append("\", ");
            } catch (IllegalAccessException e) {
                out.println("can not access field value");
            }
        }
        if (json.length() > 1) {
            json.setLength(json.length() - 2);
        }
        json.append("}");

        return json.toString();
    }
}
