package com.wilson.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentCompositeKey implements Serializable {
	
	@Override
	public String toString() {
		return "StudentCompositeKey [rollNumber=" + rollNumber + ", section=" + section + "]";
	}

	@Column(name="RollNo")
	private Integer rollNumber;
	
	
	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	private String section;

}
