package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.User;


@Repository
public interface UserRespository extends JpaRepository<User ,Integer >{
	
	User findByIdAndName(int id, String name);
	
	@Query(value="select * from user u where u.id=:id", nativeQuery=true)
	User IwantMyOwnMethod(int id);


}
