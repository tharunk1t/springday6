package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studenttable")
public class StudentEntity {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String dept;
	private String email;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public StudentEntity(int id, String name, String dept, String email) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.email = email;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
