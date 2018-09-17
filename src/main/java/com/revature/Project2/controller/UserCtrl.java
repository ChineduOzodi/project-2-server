package com.revature.Project2.controller;

import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Project2.beans.User;
import com.revature.Project2.service.UserService;

@RestController
public class UserCtrl {

	final static Logger logger = Logger.getLogger(UserCtrl.class);

	@Autowired
	UserService uService;

	// This method will get all users
	@GetMapping("/users/")
	public Iterable<User> getAllUsers() {
		logger.info("All users are being accessed.");
		return uService.getAllUsers();
	}

	// This method will get all user information
	@GetMapping("/users/login/{username}/")
	public Optional<User> loginUser(@PathVariable String username) {
		logger.info("User: " + username + " has logged in.");
		return uService.loginUser(username);
	}

	// This method will create a new user
	@PostMapping("/users/")
	public ResponseEntity<User> createUser(@RequestBody User us) {
		us = uService.createUser(us);
		logger.info("User: " + us.getUsername() + " has been created.");
		return new ResponseEntity<User>(us, HttpStatus.CREATED);
	}

	// This method will update a users information
	@PutMapping("/users/{uId}/")
	public ResponseEntity<User> updateUser(@RequestBody User us) {
		us = uService.updateUser(us);
		logger.info("User: " + us.getUsername() + " has been updated.");
		return new ResponseEntity<User>(us, HttpStatus.ACCEPTED);
	}
}
