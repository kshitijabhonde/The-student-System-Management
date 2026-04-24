package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.Student1Dao;
import com.demo.model.Student1;

import jakarta.transaction.Transactional;
@Service
@Transactional

public class Student1serviceImpl implements student1service {
	@Autowired
	private Student1Dao sd;
	@Override
	public List<Student1> addStudents(List<Student1> students) {
	    return sd.saveAll(students);
	    
	    	}
	@Override
	public void deleteStudent1(int id) {
		sd.deleteById(id);	
	}
	
	@Override
	public List<Student1> getAllStudent() {
				return sd.findAll();
	}
	@Override
	public Student1 updateStudent(int id, Student1 s) {
		s.setId(id);
				return sd.save(s);
	}
		
	
	
		
	
	
	
	
	

}
