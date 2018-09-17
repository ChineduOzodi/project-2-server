package com.revature.Project2.controller;

import java.util.Optional;

import org.apache.log4j.Logger;
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
	
	final static Logger logger = Logger.getLogger(MacroNutrientsCtrl.class);

	@Autowired
	MacroNutrientsService mnService;

	// This method will get macro nutrients based on age and sex
	@GetMapping("/macro-nutrients/{age}/{sex}")
	public Optional<MacroNutrients> getMacroNutrients(@PathVariable int age, @PathVariable int sex) {
		String gender = "";
		if (sex == 1) {
			gender = "male";
		} if (sex == 2) {
			gender = "female";
		}
		logger.info("Macro nutrients for " + gender + " age " + age + " are being loaded.");	
		return mnService.getMacroNutrients(age, sex);
	}

	// This method will save macro nutrients
	@PostMapping("/macro-nutrients")
	public ResponseEntity<MacroNutrients> saveMacroNutrients(@RequestBody MacroNutrients mn) {
		mn = mnService.saveMacroNutrients(mn);
		logger.info("Macro nutrients are being created.");
		return new ResponseEntity<MacroNutrients>(mn, HttpStatus.CREATED);
	}
}
