package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.StudentService;
import com.example.demo.entities.Student;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	List<Student> getAllStudentDetails(){
		return this.studentService.getAllStudentDetails();
	}
	
	@RequestMapping(value="/student/{id}", method=RequestMethod.GET)
	Student getStudentById(@PathVariable String id) {
		return this.studentService.getStudentById(id);
	}
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	String addNewStudent(@RequestBody Student data) {
		return this.studentService.createStudentRecord(data);
	}
	
	@RequestMapping(value="/student/{id}", method = RequestMethod.DELETE)
	String deleteStudentById(@PathVariable String id) {
		return this.studentService.deleteStudentData(id);
	}
	
	@RequestMapping(value="/student/{id}", method=RequestMethod.PUT)
	String updateStudentData(@RequestBody Student data) {
		return this.studentService.updateStudentData(data);
	}
}
