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
	
	public Optional<MacroNutrients> getMacroNutrients(int nutrientId){
		System.out.println("MacroNutrientsService -getMacroNutrients");
		return mnRepo.findById(nutrientId);
	}
	
	public MacroNutrients saveMacroNutrients(MacroNutrients mn){
		System.out.println("MacroNutrientsService -saveMacroNutrients");
		mnRepo.save(mn);
		return mn;
	}

}
