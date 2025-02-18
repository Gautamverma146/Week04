package com.tit.day06.annotations.begineer_level.annotation_todo;

import static java.lang.System.out;

public class Project {

    @Todo(task = "Push code to git", assignedTo = "Darshan", priority = "HIGH")
    public void pushToGit() {
        out.println("Pushing code to git");
    }

    @Todo(task = "Debug login module", assignedTo = "Rajveer")
    public void debugCode() {
        out.println("Debugging login module");
    }
    @Todo(task = "Write API documentation", assignedTo = "Ankit", priority = "LOW")
    public void writeDocs() {
        out.println("Writing documentation for project");
    }
    public void reviewCode(){
        out.println("Reviewing code");
    }
}
