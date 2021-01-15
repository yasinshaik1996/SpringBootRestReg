package com.springboot.rest.serv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.model.School;
import com.springboot.rest.repo.SchoolRepository;

@Service
public class SchoolService {
	@Autowired
	SchoolRepository repository;

	public void save(final School school) {
		repository.save(school);
	}

	public List<School> getAll() {
		final List<School> schools = new ArrayList<>();
		repository.findAll().forEach(school -> schools.add(school));
		return schools;
	}

}
