package com.students.entity;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Students {
	
	@Id
	int id;
	
	private String firstName;
	
	private String lastName;
	
	private String s_class;
	
	private String subject;	
	
	private String dob;

	
	
	public Students() {
		super();
	}

	
	public Students(int id, String firstName, String lastName, String s_class, String subject, String dob) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.s_class = s_class;
		this.subject = subject;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getS_class() {
		return s_class;
	}

	public String getSubject() {
		return subject;
	}

	public String getDob() {
		return dob;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setS_class(String s_class) {
		this.s_class = s_class;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
