package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> studentList;
    private int courseID;

    public Course(String courseName, ArrayList<Student> studentList, int courseID){
        this.courseName = courseName;
        this.studentList = studentList;
        this.courseID = courseID;
    }


}
