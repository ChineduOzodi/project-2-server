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

import com.revature.Project2.beans.FoodPlan;
import com.revature.Project2.service.FoodPlanService;

@RestController
public class FoodPlanCtrl {
	
	@Autowired
	FoodPlanService fpService;
	
	// This method will get a food plan
	@GetMapping("/plan/user/{uId}/")
	public Optional<FoodPlan> getFoodPlan(@PathVariable int uId) {
		System.out.println("FoodPlanCtrl -getFoodPlan");		
		return fpService.getFoodPlan(uId);
	}
	
	// This method will save a food plan
	@PostMapping("/plan/user/")
	public ResponseEntity<FoodPlan> createFoodPlan(@RequestBody FoodPlan fp){
		System.out.println("FoodPlanCtrl -createFoodPlan");
		fp = fpService.createFoodPlan(fp);
		return new ResponseEntity<FoodPlan>(fp, HttpStatus.CREATED);
	}
	
	// This method will update a food plan
	@PutMapping("/plan/{foodId}/")
	public ResponseEntity<FoodPlan> updateFoodPlan(@PathVariable int foodId, @RequestBody FoodPlan fp){
		System.out.println("FoodPlanCtrl -updateFoodPlan");
		fp = fpService.updateFoodPlan(foodId, fp);
		return new ResponseEntity<FoodPlan>(fp, HttpStatus.ACCEPTED);
	}
}
