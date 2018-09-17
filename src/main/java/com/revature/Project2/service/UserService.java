package com.revature.Project2.service;

import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2.beans.User;
import com.revature.Project2.repository.UserRepo;

@Service
public class UserService {
	
	final static Logger logger = Logger.getLogger(UserService.class);

	@Autowired
	UserRepo uRepo;

	// This method gets all users from the users table
	public Iterable<User> getAllUsers() {
		return uRepo.findAll();
	}
	
	// This method get all user information with the given username
	public Optional<User> loginUser(String username) {
		return uRepo.findByUsername(username);
	}

	// This method adds a user into the database
	public User createUser(User us) {
		us = uRepo.save(us);
		if (us == null) {
			logger.warn("User could not be created.");
		}
		
		return us;
	}

	// This method updates a users information
	public User updateUser(User us) {
		us = uRepo.save(us);
		if (us == null) {
			logger.warn("User could not be updated.");
		}
		
		return us;
	}
}
