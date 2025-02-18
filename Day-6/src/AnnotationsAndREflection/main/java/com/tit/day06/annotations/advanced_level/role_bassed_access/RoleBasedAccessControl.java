package com.tit.day06.annotations.advanced_level.role_bassed_access;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.System.out;

public class RoleBasedAccessControl {
    public static void main(String[] args) {
        //create object of software
        Software software = new Software();
        //define user
        String currentUSer = "USER";

        Class<?> softwareClass = software.getClass();
        //get all methods
        Method[] methods = softwareClass.getDeclaredMethods();
        //iterate all methods
        for(Method method : methods){
            RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);
            String roleAllowed = annotation.role();

            if(currentUSer.equals(roleAllowed)){
                out.println("\naccess granted");
                try {
                    method.invoke(software);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    out.println("can not invoke method");
                }
            }else {
                out.println("\naccess denied");
            }
        }
    }

}
