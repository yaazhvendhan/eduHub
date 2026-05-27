package com.eduHub.eduHub_backend.model;

import org.springframework.stereotype.Component;

public class Course {
    private int courseCode;
    private String subjectName;
    private int courseCredits;

    public Course() {
    }

    public Course(int courseCode, String subjectName, int courseCredits) {
        this.courseCode = courseCode;
        this.subjectName = subjectName;
        this.courseCredits = courseCredits;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

}
