package com.revature.Project2.repository;

import org.springframework.data.repository.CrudRepository;

import com.revature.Project2.beans.MealCategory;

/**
 * CrudRepository for MealCategory Bean
 */
public interface MealCategoryRepo extends CrudRepository<MealCategory, Integer> {

	// Custom Crud method to see if a meal category exist with given meal category
	// name
	public boolean existsByMealCatName(String mealCatName);

	// Custom Crud method to get meal category with given meal category name
	public MealCategory findByMealCatName(String mealCatName);

}
