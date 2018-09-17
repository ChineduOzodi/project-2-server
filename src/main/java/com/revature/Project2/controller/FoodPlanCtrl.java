package com.revature.Project2.controller;

import java.util.ArrayList;
import java.util.List;

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

import com.revature.Project2.beans.FoodPlan;
import com.revature.Project2.service.FoodPlanService;

@RestController
public class FoodPlanCtrl {
	
	final static Logger logger = Logger.getLogger(FoodPlanCtrl.class);
	
	@Autowired
	FoodPlanService fpService;
	
	// This method will get a food plan
	@GetMapping("/plan/user/{uId}/")
	public Iterable<FoodPlan> getFoodPlan(@PathVariable int uId) {
		logger.info("Getting foods for user with uId " + uId);
		return fpService.getFoodPlan(uId);
	}
	
	// This method will save a food plan
	@PostMapping("/plan/user/")
	public ResponseEntity<FoodPlan> createFoodPlan(@RequestBody FoodPlan fp){
		fp = fpService.createFoodPlan(fp);
		logger.info("Creating a food plan for user with user Id " + fp.getuId());
		return new ResponseEntity<FoodPlan>(fp, HttpStatus.CREATED);
	}
	
	// This method will update a food plan
	@PutMapping("/plan/{foodId}/")
	public ResponseEntity<FoodPlan> updateFoodPlan(@PathVariable int foodId, @RequestBody FoodPlan fp){
		fp = fpService.updateFoodPlan(foodId, fp);
		logger.info("Updating food plan with food id " + foodId +".");
		return new ResponseEntity<FoodPlan>(fp, HttpStatus.ACCEPTED);
	}
}
