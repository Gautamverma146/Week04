package com.tit.day06.annotations.advanced_level.serialization_annotation;

import java.lang.reflect.Field;

import static java.lang.System.out;

public class JsonSerializer{
    //method to convert object to json string
    public static String serialize(Object user){
        StringBuilder jsonString = new StringBuilder();
        jsonString.append("{");

        Class<?> userClass = user.getClass();

        //get all field of user
        Field[] fields = userClass.getDeclaredFields();

        //iterate all fields
        for (Field field :fields){
            if(field.isAnnotationPresent(JsonField.class)){
                field.setAccessible(true);
                JsonField annotation = field.getAnnotation(JsonField.class);
                String annotationName = annotation.name();
                Object value = null;
                try {
                    value = field.get(user);
                } catch (IllegalAccessException e) {
                    out.println("can not access field");
                }
                //append name and value to json string
                jsonString.append("\"").append(annotationName).append("\":\"").append(value).append("\", ");
            }
        }
        if (jsonString.length() > 1) {
            jsonString.setLength(jsonString.length() - 2);
        }
        jsonString.append("}");

        return jsonString.toString();
    }
}
