package com.revature.Project2.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2.beans.MealCategory;
import com.revature.Project2.beans.UserCategory;
import com.revature.Project2.repository.MealCategoryRepo;
import com.revature.Project2.repository.UserCategoryRepo;

@Service
public class UserCategoryService {
	
	final static Logger logger = Logger.getLogger(UserCategoryService.class);

	@Autowired
	UserCategoryRepo ucRepo;

	@Autowired
	MealCategoryRepo mcRepo;

	// This method will get a list of user meal categories
	public Iterable<UserCategory> getAllUserCategory(int uId) {
		return ucRepo.findAllByUId(uId);
	}

	// This method will save a user meal category and if one does not exists one will be created
	public UserCategory createUserCategory(int uId, String mealCatName) {
		UserCategory uc = new UserCategory();
		MealCategory mc = new MealCategory();

		if (mcRepo.existsByMealCatName(mealCatName)) {
			logger.warn("A new meal category needed to be created.");
			mc = mcRepo.findByMealCatName(mealCatName);
			uc.setuId(uId);
			uc.setMealCatId(mc.getMealCatId());
			uc = ucRepo.save(uc);
		} else {
			logger.warn("A new user meal category is being created.");
			mc.setMealCatName(mealCatName);
			mc = mcRepo.save(mc);
			uc.setuId(uId);
			uc.setMealCatId(mc.getMealCatId());
			uc = ucRepo.save(uc);
		}
		
		return uc;
	}
}
