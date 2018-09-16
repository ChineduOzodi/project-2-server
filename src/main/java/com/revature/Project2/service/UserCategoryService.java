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

//	public UserCategory createUserCategory(String mealCatName) {
//		System.out.println("UserCategoryService -createUserCategory");
//		MealCategory mc = new MealCategory();
//		if (mcRepo.existsByMealCatName(mealCatName)) {
//			
//		} else 
//			
//		uc = ucRepo.save(uc);
//		return uc;
//	}

}
