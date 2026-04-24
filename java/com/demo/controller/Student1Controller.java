package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student1;
import com.demo.service.student1service;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")

@RequestMapping("/student1")
public class Student1Controller {
	@Autowired
	private student1service ss;
	
	@PostMapping("/addAll")
	public List<Student1> addStudents(@RequestBody List<Student1> students) {
	    return ss.addStudents(students);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
	    ss.deleteStudent1(id);
	    return "Student deleted successfully";
	    }
	
	@GetMapping("/getall")
		public List<Student1>getall(){
		return ss.getAllStudent();
		
	}
	
	@PutMapping("/update/{id}")
    public Student1 updateStudent(@PathVariable int id, @RequestBody Student1 s) {
        return ss.updateStudent(id, s);
    }

	
}
