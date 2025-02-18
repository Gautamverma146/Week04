package com.tit.day06.reflection.intermediate_level.access_static_field;

import java.lang.reflect.Field;

import static java.lang.System.out;

public class StaticModifier {
    public static void main(String[] args) {
        Class<Configuration> configurationClass = Configuration.class;

        try {
            //get field
            Field field = configurationClass.getDeclaredField("API_KEY");
            //set accessibility
            field.setAccessible(true);
            //print api_key
            out.println("before modification - " + field.get(null));
            //modify api-key
            field.set(null, "abcdef123456");
            out.println("after modification - " + field.get(null));
        } catch (NoSuchFieldException e) {
            out.println("field not found");
        } catch (IllegalAccessException e) {
            out.println("can not access field");
        }
    }
}
