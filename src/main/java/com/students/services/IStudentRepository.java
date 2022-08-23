package com.students.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.students.entity.Students;

@Repository
public interface IStudentRepository extends JpaRepository<Students,Integer>{
	
	@Query(value="select * from STUDENTS where s_class = (:s_class)",nativeQuery = true)
	List<Students> findByClass(@Param("s_class") String s_class);
}
