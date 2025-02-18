package com.tit.day06.annotations.begineer_level.annotation_todo;

import java.lang.reflect.Method;
import static java.lang.System.out;

public class TodoProcessor {
    public static void main(String[] args) {
        Class<Project> projectClass = Project.class;

        //get all methods
        Method[] methods = projectClass.getDeclaredMethods();
        //iterate all methods
        for (Method method : methods){
            if (method.isAnnotationPresent(Todo.class)) {

                Todo annotation = method.getAnnotation(Todo.class);
                //printing task details
                out.println("\ntask - "+ annotation.task() +
                        "\nassigned to: " + annotation.assignedTo() +
                        "\npriority: " + annotation.priority() +
                        "\nmethod: " + method.getName());
            }
        }
    }
}
