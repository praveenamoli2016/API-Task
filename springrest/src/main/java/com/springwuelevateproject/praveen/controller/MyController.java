package com.springwuelevateproject.praveen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springwuelevateproject.praveen.model.Student;
import com.springwuelevateproject.praveen.services.StudentService;

@RestController
public class MyController {
	@Autowired
	private StudentService studentservice;
	@GetMapping("/home")
	public String home() {
		return "this is home page";
		
	}
	//get the students
	@GetMapping("/students")
	public List<Student>getstudents(){
	
		return this.studentservice.getstudents();
		
	}
	
     
}

