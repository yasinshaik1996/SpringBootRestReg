package com.springboot.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private String emailAddress;
	private int schoolId;
	

	public Student() {	}

	public Student(int id, String name, int age, String emailAddress, int schoolId) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.emailAddress = emailAddress;
		this.schoolId = schoolId;
		
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmailAddress() {
		return emailAddress;
	}

	public int getSchoolId() {
		return schoolId;
	}
	
}
