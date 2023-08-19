package com.codemind.PlayCenter.dao;

import com.codemind.PlayCenter.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student,Integer> {

    Student findByUserName(String userName);
}
