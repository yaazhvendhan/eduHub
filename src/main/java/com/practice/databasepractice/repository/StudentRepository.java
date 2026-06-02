package com.practice.databasepractice.repository;

import com.practice.databasepractice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findStudentByGenderAndTech(String gender,String tech);
    List<Student> findStudentByTech(String tech);

    @Query(nativeQuery = true,
    value = "SELECT * FROM student WHERE gender=:gender And tech=:tech")
    List<Student> findStudentByGenAndTech(@Param("gender") String gender,@Param("tech") String tech);

    @Query("SELECT s FROM Student s WHERE s.name=:name")
    List<Student>findStudentByName(String name);
}
