package com.revature.Project2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2.beans.User;
import com.revature.Project2.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo uRepo;
	
	public Optional<User> getUser(int uId){
		System.out.println("UserService -getUser");
		Optional<User> us = uRepo.findById(uId);
		System.out.println(us);
		return us;
	}
	
	public List<User> retrieveAllUsers(){
		System.out.println("UserService - retrieveAllUsers");
		return (List<User>) uRepo.findAll();
	}
	
	public User createUser(User us){
		System.out.println("UserService -createUser");
		uRepo.save(us);
		return us;
	}

}
