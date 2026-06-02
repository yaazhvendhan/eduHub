package com.practice.databasepractice.service;

import com.practice.databasepractice.model.Student;
import com.practice.databasepractice.repository.Repo;
import com.practice.databasepractice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    Repo r;
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return r.findAll();
    }

    public Student getStudentByRoll(int roll) {
        return r.findById(roll).orElse(null);
    }

    public void addStudentByRoll(Student std) {
        r.save(std);
    }

    public Student updateStudentByRoll(int roll, Student std) {
        Student stu = r.findById(roll).orElse(null);
        stu.setName(std.getName());
        stu.setTech(std.getTech());
        return r.save(stu);
    }

    public String deleteStudentByRoll(int roll) {
        r.deleteById(roll);
        return "Student Deleted Successfully";
    }

    public String deleteAllStudents() {
        r.deleteAll();
        return "Students Deleted Successfully";
    }

    public List<Student> getCustomStudent(String gender,String tech) {
        return studentRepository.findStudentByGenderAndTech(gender,tech);
    }

    public List<Student> getStudentByTech(String tech) {
        return studentRepository.findStudentByTech(tech);
    }

    public List<Student> getStudentByGenderAndTech(String gender, String tech) {
        return studentRepository.findStudentByGenAndTech(gender,tech);
    }

    public List<Student> getStudentByName(String name) {
        return studentRepository.findStudentByName(name);
    }
}
