package com.springboot.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class School {
	@Id
	@GeneratedValue
	
	private int sclId;
	private String sclName;
	
	public School() {  }
	
	public School(int sclId, String sclName) {
		super();
		this.sclId = sclId;
		this.sclName = sclName;
	}


	public int getSclId() {
		return sclId;
	}

	public String getSclName() {
		return sclName;
	}
		

}
