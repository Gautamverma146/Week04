package com.tit.day06.annotations.exercise.custom_annotation;

import static java.lang.System.out;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        //get class
        Class<TaskManager> taskManagerClass = TaskManager.class;

        //get method of task manager
        Method[] methods = taskManagerClass.getDeclaredMethods();
        //iterate each method
        for(Method method : methods){
            //get annotations
            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
            //print annotation details
            out.println("\nmethod - " + method.getName() +
                    "\npriority - " + taskInfo.priority() +
                    "\nassigned to - "+taskInfo.assignTo());
        }
    }
}

