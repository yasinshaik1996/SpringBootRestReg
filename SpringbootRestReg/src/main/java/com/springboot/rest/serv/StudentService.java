package com.springboot.rest.serv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.model.Student;
import com.springboot.rest.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repository;

	public void save(final Student student) {
		repository.save(student);
	}

	public List<Student> getAll() {
		final List<Student> students = new ArrayList<>();
		repository.findAll().forEach(student -> students.add(student));
		return students;
	}
}
