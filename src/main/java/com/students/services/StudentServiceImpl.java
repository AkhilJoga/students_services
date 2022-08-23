package com.students.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.entity.Students;
import com.students.exceptions.ResponseExceptions;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	IStudentRepository iStudentRepository;
	
	
	
	
	@Override
	public void createStudent(Students student) {
		// TODO Auto-generated method stub
		iStudentRepository.save(student);
		
	}

	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		 iStudentRepository.deleteById(id);
	}

	@Override
	public Students updateStudent(Students student,int id) {
		// TODO Auto-generated method stub
		Students ex_students;
	
			ex_students = iStudentRepository.findById(id).orElseThrow(
					() -> new ResponseExceptions("Students","id",id) );
			ex_students.setDob(student.getDob());
			ex_students.setFirstName(student.getFirstName());
			ex_students.setLastName(student.getLastName());
			ex_students.setSubject(student.getSubject());
			ex_students.setS_class(student.getS_class());
			
			return ex_students;	
	}

	@Override
	public Optional<Students> getById(Integer id) {
		// TODO Auto-generated method stub
		return iStudentRepository.findById(id);
	}

	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		return iStudentRepository.findAll();
	}

	@Override
	public List<Students> getByClass(String s_class) {
		// TODO Auto-generated method stub
		return  iStudentRepository.findByClass(s_class);
	
	}
	

}
