package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;

public interface StudentDao extends JpaRepository<Student, String>{

}
