package com.revature.Project2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Project2.beans.MacroNutrients;
import com.revature.Project2.service.MacroNutrientsService;

@RestController
public class MacroNutrientsCtrl {
	
	@Autowired
	MacroNutrientsService mnService;
	
	@GetMapping("/macro-nutrients/{nutrientId}")
	public Optional<MacroNutrients> getMacroNutrients(@PathVariable int nutrientId){
		System.out.println("MacroNutrientsCtrl -getMacroNutrients");
		return mnService.getMacroNutrients(nutrientId);
	}
	
	// 201 -CREATED
		@PostMapping("/macro-nutrients")
		public ResponseEntity<MacroNutrients> saveMacroNutrients(@RequestBody MacroNutrients mn){
			System.out.println("MacroNutrientsCtrl -saveMacroNutrients");
			mn = mnService.saveMacroNutrients(mn);
			return new ResponseEntity<MacroNutrients>(mn, HttpStatus.CREATED);
		}
}
