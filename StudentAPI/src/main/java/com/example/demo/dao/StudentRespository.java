package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Student.Student;

@Repository
public interface StudentRespository extends JpaRepository<Student ,Integer> {
	
	

}
