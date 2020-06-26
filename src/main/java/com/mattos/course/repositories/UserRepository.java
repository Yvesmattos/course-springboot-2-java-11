package com.mattos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mattos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
