package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;

public interface UserService {
	
	public UserDTO getUser();

	
	
	public UserDTO getUser(int id);



	public void save(UserDTO userDTO);



	public void deleteUser();



}
