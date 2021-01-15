package com.springboot.rest.ctrl;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.model.Student;
import com.springboot.rest.serv.StudentService;

@RestController		
public class StudentController {

	private final Logger log = LoggerFactory.getLogger(this.getClass()); 

	@Autowired
	StudentService service;
	
	@RequestMapping(value= "/welcome")
	public String hello(ModelMap map) {
		//map.put("error","Welcome");
		return "welcome.jsp";
	}

	@RequestMapping(value= "/student/save")
	public int save(final @RequestBody @Valid Student student) {
		log.info("Saving student details in the database.");
		service.save(student);
		return student.getId();
	}

	@RequestMapping(value= "/student/getall", produces= "application/vnd.jcg.api.v1+json")
	public List<Student> getAll() {
		log.info("Getting student details from the database.");
		return service.getAll();
	}
}
