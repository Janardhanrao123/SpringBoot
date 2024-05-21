package com.example.demo.Service;

import com.example.demo.dto.StudentDTO;

public interface StudentService {
	
	
	public StudentDTO getStudent() ;
	
	public void saveStudent(StudentDTO studentdto);
	
	public StudentDTO deletStudent(int id);

	public StudentDTO getStudent(int id);

	

}
