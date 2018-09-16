package com.revature.Project2.controller;

import java.util.Optional;

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

	@Autowired
	UserService uService;
	
	// This method will get all users
	@GetMapping("/all-users/")
	public Iterable<User> getAllUsers(){
		System.out.println("UserCtrl -getAllUsers");
		return uService.getAllUsers();
	}	
		
	// This method will get all user information
	@GetMapping("/user/login/{username}")
	public Optional<User> loginUser(@PathVariable String username){
		System.out.println("UserCtrl -loginUser");
		return uService.loginUser(username);
	}
	
	// This method will create a new user (register a new user)
	@PostMapping("/user/")
	public ResponseEntity<User> createUser(@RequestBody User us){
		System.out.println("UserCtrl -createUser");
		us = uService.createUser(us);
		return new ResponseEntity<User>(us, HttpStatus.CREATED);
	}
	
	// This method will update a users information
	@PutMapping("/user/{uId}/")
	public ResponseEntity<User> updateUser(@RequestBody User us){
		System.out.println("UserCtrl -updateUser");
		us = uService.updateUser(us);
		return new ResponseEntity<User>(us, HttpStatus.ACCEPTED);
	}
}
