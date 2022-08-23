package com.students.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.students.entity.Students;
import com.students.services.StudentServiceImpl;

@RestController
public class StudentsController {

	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@PostMapping("/createStudent/")
	public void createStudent(@RequestBody Students student) {
		
		studentServiceImpl.createStudent(student);
		
	}
	
	@GetMapping("/getById/{id}")
	public Optional<Students> getById(@PathVariable int id) {
		
		return studentServiceImpl.getById(id);
	}
	
	@GetMapping("/getByClass/{s_class}")
	public List<Students> getByClass(@PathVariable String s_class) {
		return studentServiceImpl.getByClass(s_class);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable int id) {
		 studentServiceImpl.deleteStudent(id);
	}
	
	@PostMapping("/updateStudent/{id}")
	public ResponseEntity<Students> updateStudent(@PathVariable("id") int id,@RequestBody Students sutdent) {
		return new ResponseEntity<Students>(studentServiceImpl.updateStudent(sutdent, id),HttpStatus.OK);
	}
	
	@GetMapping("/getAllStudents/")
	public List<Students> getAllStudents(){
		return studentServiceImpl.getAllStudents();
	}
}
