package com.revature.Project2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Project2.beans.UserCategory;
import com.revature.Project2.service.UserCategoryService;

@RestController
public class UserCategoryCtrl {

	@Autowired
	UserCategoryService ucService;

	// This method will get a user category
	@GetMapping("/user-category/{uId}/")
	public Iterable<UserCategory> getAllUserCategory(@PathVariable int uId) {
		System.out.println("UserCategoryCtrl -getAllUserCategory");
		return ucService.getAllUserCategory(uId);
	}

	// This method will save a user category
	@PostMapping("/user-category/{uId}")
	public ResponseEntity<UserCategory> createUserCategory(@PathVariable int uId, @RequestBody String mealCatName) {
		System.out.println("UserCategoryCtrl -createUserCategory");
		UserCategory uc = new UserCategory();
		uc = ucService.createUserCategory(uId, mealCatName);
		return new ResponseEntity<UserCategory>(uc, HttpStatus.CREATED);
	}
}
