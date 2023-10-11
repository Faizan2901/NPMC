package com.codemind.PlayCenter.dao;

import com.codemind.PlayCenter.entity.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student, Integer> {

    Student findByUserName(String userName);
    
    List<Student> findByEnabled(int isStudent);
    
    Student findByResetPasswordToken(String token);
    
    Student findByEmail(String email);
    
}
