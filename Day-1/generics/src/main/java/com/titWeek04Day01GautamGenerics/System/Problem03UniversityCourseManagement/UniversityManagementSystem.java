package com.titWeek04Day01GautamGenerics.System.Problem03UniversityCourseManagement;

import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract void evaluation();

    @Override
    public String toString() {
        return "Course Name: " + courseName;
    }
}

class ExamBased extends CourseType {
    public ExamBased(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluation() {
        System.out.println("Evaluation based on Exam: " + getCourseName());
    }
}

class Assignment extends CourseType {
    public Assignment(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluation() {
        System.out.println("Evaluation based on Assignments: " + getCourseName());
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluation() {
        System.out.println("Evaluation based on Research: " + getCourseName());
    }
}

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Courses: " + courses;
    }
}

public class UniversityManagementSystem {

    // Method to display any type of courses using wildcard
    public static void displayCourse(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
            course.evaluation();
        }
    }

    public static void main(String[] args) {
        // Adding exam-based courses
        Course<ExamBased> examBasedCourse = new Course<>();
        examBasedCourse.addCourse(new ExamBased("Maths"));
        examBasedCourse.addCourse(new ExamBased("Hindi"));

        Course<Assignment> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new Assignment("English"));
        assignmentCourses.addCourse(new Assignment("Economics"));

        // Adding research-based courses
        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI"));
        researchCourses.addCourse(new ResearchCourse("ML"));

        System.out.println("Displaying all courses:");

        displayCourse(examBasedCourse.getCourses());
        displayCourse(assignmentCourses.getCourses());
        displayCourse(researchCourses.getCourses());
    }
}
