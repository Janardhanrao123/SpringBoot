package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	//@RequestMapping(name="/create-user", method=RequestMethod.POST)
	@PostMapping("/create-user")
	public String CreateUser(@RequestBody UserDTO userDTO) {
		userService.save(userDTO);
		
		return "User Saved Sucessfully ! ";
		
	}
	
	@GetMapping("/get-user1")
	public UserDTO GetUser() {
		
		System.out.println("Controller Invoked !! ");
		
		return userService.getUser();
	} 
	
	@GetMapping("/get-user/{id}")
	public UserDTO GetUser(@PathVariable int id) {
		
		System.out.println("Controller Invoked !! as user of id "+ id);
		
		return userService.getUser(id);
		
	}
	
	@GetMapping("/get-user")
	public UserDTO GetUserWithReqparam(@RequestParam(name="mail",required=false) int mail) {
		
		System.out.println("Controller Invoked !! as user of id "+ mail);
		
		return userService.getUser(mail);
		
	}
	
	@PutMapping("/update-user")
	public String UpdateUser(@RequestBody UserDTO userDTO) {
		userService.save(userDTO);
		
		return "User updated Sucessfully ! ";
		
	}
	
	@DeleteMapping("/delete-user")
	public void DeleteUser() {
		
		userService.deleteUser();
		System.out.println("User Deleted Sucessfully !!");
	}
	

}
