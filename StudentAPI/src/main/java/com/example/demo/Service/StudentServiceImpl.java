package com.example.demo.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Student.Student;
import com.example.demo.dao.StudentRespository;
import com.example.demo.dto.StudentDTO;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRespository studentRespository;
	
	@Override
	public StudentDTO getStudent() {
		
		Student student = studentRespository.findById(1).get();
		StudentDTO studentdto= new StudentDTO();
		BeanUtils.copyProperties(student, studentdto);
		
		return studentdto;
		
	}

	@Override
	public void saveStudent(StudentDTO  studentdto) {
		Student student=new Student();
		BeanUtils.copyProperties(studentdto,student);
		Student savedStudent=studentRespository.save(student);
		System.out.println("Student Saved Sucessfully !!");
		
	}

	@Override
	public StudentDTO deletStudent(int id) {
		
		
		studentRespository.deleteById(id);
		return null;
		
	}

	@Override
	public StudentDTO getStudent(int id) {
		Student student = studentRespository.findById(id).get();
		StudentDTO studentdto= new StudentDTO();
		BeanUtils.copyProperties(student, studentdto);
		
		return studentdto;
	}

}
