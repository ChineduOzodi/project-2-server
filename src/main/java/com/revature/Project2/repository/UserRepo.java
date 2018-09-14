package com.revature.Project2.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.revature.Project2.beans.User;

/**
 *  @author Eddie Grays
 *  
 *  CrudRepository for User Bean
 *
 */
public interface UserRepo extends CrudRepository<User, Integer> {
	
	public Optional<User> findByUsernameAndPassword (String username, String password);
}
