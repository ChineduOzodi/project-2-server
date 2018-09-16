package com.revature.Project2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2.beans.FoodPlan;
import com.revature.Project2.repository.FoodPlanRepo;

@Service
public class FoodPlanService {
	
	@Autowired
	FoodPlanRepo fpRepo;

	public Optional<FoodPlan> getFoodPlan(int uId) {
		System.out.println("FoodPlanService -getFoodPlan");
		return fpRepo.findByUId(uId);
	}

	public FoodPlan createFoodPlan(FoodPlan fp) {
		System.out.println("FoodPlanService -createFoodPlan");
		fp = fpRepo.save(fp);
		return fp;
	}

	public FoodPlan updateFoodPlan(int uId, FoodPlan fp) {
		System.out.println("FoodPlanService -updateFoodPlan");
		fp = fpRepo.save(fp);
		return fp;
	}
}
