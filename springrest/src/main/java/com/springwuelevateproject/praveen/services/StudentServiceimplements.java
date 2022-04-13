package com.springwuelevateproject.praveen.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springwuelevateproject.praveen.model.Student;
@Service
public class StudentServiceimplements implements StudentService {
	List<Student> list;
      public StudentServiceimplements() {
    	  list=new ArrayList<>();
    	  list.add(new Student(2014,"praveen","mechanical"));
    	  list.add(new Student(2015,"naveen","computer science"));
    	  
      }
	@Override
	public List<Student> getstudents() {
		
		return list;
	}

	}
	


