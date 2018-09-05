package com.revature.Project2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Project2.beans.User;
import com.revature.Project2.service.UserService;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
public class UserCtrl {

	@Autowired
	UserService uService;
	
	@GetMapping("/user/{uId}")
	public Optional<User> getUser(@PathVariable int uId){
		System.out.println("UserCtrl -getUser");
		uService.getUser(uId);
		return uService.getUser(uId);
	}
	
//	@GetMapping("/login")
//	public List<User> getAllUsers(){
//		System.out.println("UserCtrl -getAllUsers");
//		return uService.retrieveAllUsers();
//	}
	
	// 201 -CREATED
	@PostMapping("/register")
	public ResponseEntity<User> createUser(@RequestBody User us){
		System.out.println("UserCtrl -createUser");
		us = uService.createUser(us);
		return new ResponseEntity<User>(us, HttpStatus.CREATED);
	}
	
}
