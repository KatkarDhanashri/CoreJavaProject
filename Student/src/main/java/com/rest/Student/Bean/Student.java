package com.rest.Student.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Details")
public class Student {
	@Id
	private int id;
	private String name;
	private String email;
	private String branch;
	private float percentage;
	
	public Student() { }
	
	public Student(int id, String name, String email, String branch, float percentage) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.branch = branch;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	

}
