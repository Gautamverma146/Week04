package com.tit.day06.annotations.exercise.custom_annotation;
import static java.lang.System.out;

public class TaskManager {

    //task - pushing code to git
    @TaskInfo(priority = 2, assignTo = "Darshan")
    public void pushToGit(){
        out.print("task - push code to github");
    }
    //task - writing test
    @TaskInfo(priority = 5, assignTo = "Rajveer")
    public void writeTest(){
        out.print("task - write test for code");
    }
}
