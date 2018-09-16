package com.revature.Project2.repository;

import org.springframework.data.repository.CrudRepository;

import com.revature.Project2.beans.MealCategory;

/**  
 *  CrudRepository for MealCategory Bean
 */
public interface MealCategoryRepo extends CrudRepository<MealCategory, Integer> {
	
	public boolean existsByMealCatName(String mealCatName);

	public MealCategory findByMealCatName(String mealCatName);

}
