package com.revature.Project2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2.beans.MealCategory;
import com.revature.Project2.beans.UserCategory;
import com.revature.Project2.repository.MealCategoryRepo;
import com.revature.Project2.repository.UserCategoryRepo;

@Service
public class UserCategoryService {

	@Autowired
	UserCategoryRepo ucRepo;

	@Autowired
	MealCategoryRepo mcRepo;

	public Iterable<UserCategory> getAllUserCategory(int uId) {
		System.out.println("UserCategoryService -getAllUserCategory");
		return ucRepo.findAllByUId(uId);
	}

	public UserCategory createUserCategory(int uId, String mealCatName) {
		System.out.println("UserCategoryService -createUserCategory");
		UserCategory uc = new UserCategory();
		MealCategory mc = new MealCategory();

		if (mcRepo.existsByMealCatName(mealCatName)) {
			mc = mcRepo.findByMealCatName(mealCatName);
			uc.setuId(uId);
			uc.setMealCatId(mc.getMealCatId());
			uc = ucRepo.save(uc);
		} else {
			mc.setMealCatName(mealCatName);
			mc = mcRepo.save(mc);
			uc.setuId(uId);
			uc.setMealCatId(mc.getMealCatId());
			uc = ucRepo.save(uc);
		}
		
		return uc;
	}
}
