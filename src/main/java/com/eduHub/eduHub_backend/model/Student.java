package com.eduHub.eduHub_backend.model;

public class Student {
    private int studentId;
    private String studentName;
    private String studentPassword;

    public Student() {
    }

    public Student(int studentId, String studentName, String studentPassword) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPassword = studentPassword;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }
}
