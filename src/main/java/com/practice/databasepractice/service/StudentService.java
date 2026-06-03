package com.practice.databasepractice.service;

import com.practice.databasepractice.Dto.StudentDto;
import com.practice.databasepractice.model.Student;
import com.practice.databasepractice.repository.Repo;
import com.practice.databasepractice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
=import org.springframework.stereotype.Service;

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

    public StudentDto getStudentByRollDto(int roll) {
        Student student = studentRepository.findById(roll).orElseThrow();
        return convertStudentDto(student);
    }

    // Student --to -- StudentDto
    public StudentDto convertStudentDto(Student student){
        StudentDto std = new StudentDto();
        std.setRoll(student.getRoll());
        std.setRoll(student.getRoll());
        std.setTech(student.getTech());
        std.setGender(student.getGender());
        std.setEmail(student.getEmail());
        return std;
    }

    public StudentDto addStudentByDto(StudentDto student) {
        studentRepository.save(convertStudent(student)) ;
        return  student;
    }

    // StudentDto --to -- Student
    public Student convertStudent(StudentDto std ){
        Student student = new Student();

        student.setRoll(std.getRoll());
        student.setName(std.getName());
        student.setGender(std.getGender());
        student.setTech(std.getTech());
        student.setEmail(std.getEmail());
        return student;
    }

    public Page<Student> getAllStudentsAsPage(int page, int size) {
        return studentRepository.findAll(PageRequest.of(page,size));
    }
}
