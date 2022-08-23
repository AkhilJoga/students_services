package com.students.services;

import java.util.List;
import java.util.Optional;

import com.students.entity.Students;

public interface IStudentService {
	

	public void createStudent(Students student);
	
	public void deleteStudent(Integer id);
	
	public Students updateStudent(Students student,int id);
	
	public Optional<Students> getById(Integer id);
	
	public List<Students> getAllStudents();
	
	public List<Students> getByClass(String s_class);
	
	
	
}
