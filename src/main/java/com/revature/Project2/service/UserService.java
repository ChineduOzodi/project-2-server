package com.revature.Project2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2.beans.User;
import com.revature.Project2.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo uRepo;

	public Iterable<User> getAllUsers() {
		System.out.println("UserService - getAllUsers");
		return uRepo.findAll();
	}
	
	public Optional<User> loginUser(String username) {
		System.out.println("UserService -loginUser");
		return uRepo.findByUsername(username);
	}

	public User createUser(User us) {
		System.out.println("UserService -createUser");
		us = uRepo.save(us);
		return us;
	}

	public User updateUser(User us) {
		System.out.println("UserService -updateUser");
		us = uRepo.save(us);
		return us;
	}
}
