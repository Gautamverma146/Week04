package com.tit.day06.annotations.begineer_level.annotation_important;

import java.lang.reflect.Method;
import static java.lang.System.out;

public class AnnotationProcessor {
    public static void main(String[] args) {
        //get class
        Class<ATMService> atmServiceClass = ATMService.class;

        //get methods
        Method[] methods = atmServiceClass.getDeclaredMethods();

        //iterate methods
        for(Method method : methods){
            if(method.isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                out.println("method -" + method.getName() + ", importance level - " + annotation.level());
            }
        }
    }
}
