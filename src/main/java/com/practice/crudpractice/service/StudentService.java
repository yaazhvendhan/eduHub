package com.practice.crudpractice.service;

import com.practice.crudpractice.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> studentList = new ArrayList<>( Arrays.asList(new Student(1,"Yaazh","SpringBoot"),
            new Student(2,"Saturn","C++"),
            new Student(3,"Snow","Python")) );
    public List<Student> getAllStudent() {
        return studentList;
    }

    public Student getStudentByRollNo(int roll_number) {
//        int index = 0;
//        for(int i=0;i<studentList.size();i++){
//            if(studentList.get(i).getRoll_no()==roll_number){
//                index =i;
//            }
//        }
        for(Student s : studentList){
            if(s.getRoll_no()==roll_number){
                return s;
            }
        }
        return new Student(0,"Student Not Found","Not Found");
    }

    public void addStudent(Student std) {
        studentList.add(std);
    }

    public String updateStudent(int roll, Student updatestudent) {
        for(Student s : studentList){
            if(s.getRoll_no() == roll){
                s.setName(updatestudent.getName());
                s.setTech(updatestudent.getTech());
                return "Student : " + s.getName() + "Updated Successfully";
            }
        }
        return "Student Not Found";
    }




}
