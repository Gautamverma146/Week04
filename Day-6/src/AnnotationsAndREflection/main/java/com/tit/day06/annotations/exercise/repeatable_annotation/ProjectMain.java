package com.tit.day06.annotations.exercise.repeatable_annotation;

import java.lang.reflect.Method;

import static java.lang.System.out;

public class ProjectMain {
    public static void main(String[] args) {
        //get project class
        Class<Project> projectClass = Project.class;
        try {
            //get method of project
            Method method = projectClass.getMethod("buggyCode");

            //retrieve annotations
            BugReport[] bugReports = method.getDeclaredAnnotationsByType(BugReport.class);

            //print all bug
            for(BugReport bugReport : bugReports){
                String description = bugReport.description();
                out.println("bug report - " + description);
            }
        } catch (NoSuchMethodException e) {
            out.println("method not found");
        }
    }
}
