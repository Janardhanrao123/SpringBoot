package com.example.demo.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	
	private String password;
	private String name;
	private double marks;
	private String grade;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", password=" + password + ", name=" + name + ", marks=" + marks + ", grade="
				+ grade + "]";
	}
	
	
	public Student() {
		
	}
	
	
	

}
