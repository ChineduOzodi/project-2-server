package com.revature.Project2.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.revature.Project2.beans.FoodPlan;

/**
 * CrudRepository for FoodPlan Bean
 */
public interface FoodPlanRepo extends CrudRepository<FoodPlan, Integer> {

	// Custom Crud method to get food plan based on user id
	public Iterable<FoodPlan> findByUId(int uId);

}
