package com.practice.databasepractice.repository;

import com.practice.databasepractice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository <Student,Integer>{}
