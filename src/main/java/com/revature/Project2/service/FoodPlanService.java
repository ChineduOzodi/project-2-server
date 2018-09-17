package com.revature.Project2.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2.beans.FoodPlan;
import com.revature.Project2.repository.FoodPlanRepo;

@Service
public class FoodPlanService {
	
	final static Logger logger = Logger.getLogger(FoodPlanService.class);
	
	@Autowired
	FoodPlanRepo fpRepo;

	public Iterable<FoodPlan> getFoodPlan(int uId) {
		return fpRepo.findByUId(uId);
	}

	public FoodPlan createFoodPlan(FoodPlan fp) {
		fp = fpRepo.save(fp);
		if (fp == null) {
			logger.warn("Food Plan could not be created.");
		}
		
		return fp;
	}

	public FoodPlan updateFoodPlan(int uId, FoodPlan fp) {
		fp = fpRepo.save(fp);
		if (fp == null) {
			logger.warn("Food Plan could not be updated.");
		}
		
		return fp;
	}
}
