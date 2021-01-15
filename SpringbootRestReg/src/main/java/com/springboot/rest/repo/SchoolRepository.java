package com.springboot.rest.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.rest.model.School;

@Repository
public interface SchoolRepository extends CrudRepository<School, Integer> {

}
