package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Student;

public interface StudentService {
	List<Student> getAllStudentDetails();
	Student getStudentById(String id);
	String createStudentRecord(Student data);
	String deleteStudentData(String id);
	String updateStudentData(Student _student);
}
