package com.revature.Project2.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.revature.Project2.beans.MacroNutrients;

/**
 * @author Eddie Grays
 * 
 *         CrudRepository for MacroNutrients Bean
 *
 */
public interface MacroNutrientsRepo extends CrudRepository<MacroNutrients, Integer> {

	public Optional<MacroNutrients> findByMinAgeAndMaxAgeAndSex(int minAge, int maxAge, int sex);
}
