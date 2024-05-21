package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.dto.StudentDTO;

@RestController
public class StudentController {

	@Autowired
	StudentService studentservice;
	
	@PostMapping("/create-student")
	public String CreateStudentDeatils(@RequestBody StudentDTO studentdto){
		studentservice.saveStudent(studentdto);
		
		return "User Created Sucessfully";
		
	}
	
	
	@GetMapping("/get-student")
	public StudentDTO getStudentSpecificId() {
		
			System.out.println("Controller Invoked !! ");
			
			return studentservice.getStudent();
		
	}
	
	@GetMapping("/get-student/{id}")
	public StudentDTO getStudentByid(@PathVariable int id) {
		
			System.out.println("Controller Invoked !! "+id);
			
			return studentservice.getStudent(id);
		
	}
	
	@PutMapping("/update-student")
	public String UpdateStudentDeatils(@RequestBody StudentDTO studentdto) {
		studentservice.saveStudent(studentdto);
		return "Students Details updates sucessfully";
	}
	
	
	@DeleteMapping("/delete-student/{id}")
	public StudentDTO DeleteStudentDetails(@PathVariable int id) {
		
		System.out.println("Student id: "+id+" has been deleted from the Student table ");
		
		return studentservice.deletStudent(id);
		
	}
	
	
}
