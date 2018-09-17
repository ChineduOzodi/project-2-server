package com.revature.Project2.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.revature.Project2.beans.User;

/**
 * CrudRepository for User Bean
 */
public interface UserRepo extends CrudRepository<User, Integer> {

	// Custom Crud method to get user with a certain username
	public Optional<User> findByUsername(String username);
}
