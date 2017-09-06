/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

package polymorphism;

import java.util.ArrayList;

/**
 * Student specialized Person child class
 * @author Manoel Vilela
 */
public class Student extends Person {
    private int studentId;
    private ArrayList<String> courses;
    
    public int getStudentId() {
        return this.studentId;
    }
    
    public ArrayList<String> getCourses() {
        return this.courses;
    }
    
    public void addCourse(String course) {
        this.courses.add(course);
    }
    
    @Override
    public String getName() {
        return "Student: " + name;
    }
    
}
