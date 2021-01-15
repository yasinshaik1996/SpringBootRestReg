package com.springboot.rest.ctrl;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.model.School;
import com.springboot.rest.serv.SchoolService;

@RestController
public class SchoolController {

	private final Logger log = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	SchoolService servicee;

	
	@RequestMapping(value= "/school/save")
	public int save(final @RequestBody @Valid School school) {
		log.info("Saving school details in the database.");
		servicee.save(school);
		return school.getSclId();
	}

	@RequestMapping(value= "/school/getSchools", produces= "application/vnd.jcg.api.v1+json")
	public List<School> getBySchool() {
		log.info("Getting school details from the database.");
		return servicee.getAll ();
	}
	


}
