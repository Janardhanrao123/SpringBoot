package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRespository;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRespository userRepository;

	@Override
	public UserDTO getUser(){
		
		User user = userRepository.findById(100).get();
		
		UserDTO userDTO = new UserDTO();
		
		BeanUtils.copyProperties(user,userDTO);
		
		
		return userDTO;
	}

	@Override
	public UserDTO getUser(int id) {
		//User user = userRepository.findById(id).get();
		
		User user = userRepository.IwantMyOwnMethod(id);
		
		UserDTO userDTO = new UserDTO();
		
		BeanUtils.copyProperties(user,userDTO);
		
		return userDTO;
	}
 
	@Override
	public void save(UserDTO userDTO) {
		User user=new User();
		BeanUtils.copyProperties(userDTO,user);
		User savedUser=userRepository.save(user);
		System.out.println("Saved User Sucessfully !!");
		
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		
		userRepository.deleteById(22);
		
		
	}

	

}
