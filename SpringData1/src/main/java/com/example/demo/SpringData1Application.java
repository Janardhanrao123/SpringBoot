package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.UserRespository;
import com.example.demo.entity.User;

@SpringBootApplication
public class SpringData1Application {
	
	

	
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringData1Application.class, args);
		
		/** 	User user1= new User(1,"Anna",23);
		
		UserRespository userRespository = applicationContext.getBean("userRespository",UserRespository.class);
		
		User save =userRespository.save(user1);
		List<User> userData = userRespository.findAll();
		System.out.println(save);
		
		
		System.out.println("*********"+ userRespository.findByIdAndName(1,"Anna"));
		
		Optional<User> findById = userRespository.findById(100);
		findById.get(); **/
		
		/** Optional<User> findByIdOptional = userRespository.findById(999);
		if (findByIdOptional.isPresent()) {
		    User user = findByIdOptional.get();
		    // Now you can safely use the user object
		} else {
		    System.out.println("User with ID 999 not found.");
		} **/

		
		
		//for(User user : userData) {
		//	System.out.println(userData);
		//}
		
		//System.out.println("******User Created *****");
	}

}
