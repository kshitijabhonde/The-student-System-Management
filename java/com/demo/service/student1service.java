package com.demo.service;

import java.util.List;

import com.demo.model.Student1;

public interface student1service {
	List<Student1> addStudents(List<Student1> students1);
	
	void deleteStudent1(int id);
	
	List<Student1>getAllStudent();
	
	Student1 updateStudent(int id, Student1 s);
	

}
