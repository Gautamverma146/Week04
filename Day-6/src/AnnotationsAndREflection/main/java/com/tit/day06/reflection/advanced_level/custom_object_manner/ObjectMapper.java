package com.tit.day06.reflection.advanced_level.custom_object_manner;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import static java.lang.System.out;

public class ObjectMapper{
    //method to set field values from a given Map.
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties){
        Constructor<T> constructor;
        try {
            //get constructor of class
            constructor = clazz.getConstructor();
        } catch (NoSuchMethodException e) {
            out.println("can not access constructor");
            return null;
        }
        T object;
        try {
            //create instance
            object = constructor.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            out.print("can not create instance of class");
            return null;
        }
        //set field values
        for(Map.Entry<String, Object> entry : properties.entrySet()){
            //get field name and value
            String fieldName = entry.getKey();
            Object fieldValue = entry.getValue();

            try {
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                field.set(object, fieldValue);
            } catch (NoSuchFieldException e) {
                out.print(fieldName + " field not found");
            } catch (IllegalAccessException e) {
                out.print("unable to set value");
            }
        }
        return object;
    }
}
