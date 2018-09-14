package com.revature.Project2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2.beans.MacroNutrients;
import com.revature.Project2.repository.MacroNutrientsRepo;

@Service
public class MacroNutrientsService {

	@Autowired
	MacroNutrientsRepo mnRepo;

	public Optional<MacroNutrients> getMacroNutrients(int age, int sex) {
		System.out.println("MacroNutrientsService -getMacroNutrients");

		int minAge = 0;
		int maxAge = 0;

		if (1 <= age && age <= 3) {
			minAge = 1;
			maxAge = 3;

		} else if (4 <= age && age <= 8) {
			minAge = 4;
			maxAge = 8;
			
		} else if (9 <= age && age <= 13) {
			minAge = 9;
			maxAge = 13;
			
		} else if (14 <= age && age <= 18) {
			minAge = 14;
			maxAge = 18;
			
		} else if (19 <= age && age <= 30) {
			minAge = 19;
			maxAge = 30;
			
		} else if (31 <= age && age <= 50) {
			minAge = 31;
			maxAge = 50;
			
		} else if (51 <= age && age <= 100) {
			minAge = 51;
			maxAge = 100;
		}

		return mnRepo.findByMinAgeAndMaxAgeAndSex(minAge, maxAge, sex);
	}

	public MacroNutrients saveMacroNutrients(MacroNutrients mn) {
		System.out.println("MacroNutrientsService -saveMacroNutrients");
		mnRepo.save(mn);
		return mn;
	}

}
