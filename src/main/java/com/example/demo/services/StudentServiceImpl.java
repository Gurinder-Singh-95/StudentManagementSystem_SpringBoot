package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.entities.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getAllStudentDetails() {
		return this.studentDao.findAll();
	}


	@Override
	public Student getStudentById(String id) {
		return this.studentDao.getById(id);
	}


	@Override
	public String createStudentRecord(Student data) {
		this.studentDao.save(data);
		return "Student data inserted";
	}


	@Override
	public String deleteStudentData(String id) {
		this.studentDao.deleteById(id);
		return "Student removed";
	}


	@Override
	public String updateStudentData(Student _student) {
		this.studentDao.save(_student);
		return "Student record updated";
	}
	
}
