package com.revature.Project2.repository;

import org.springframework.data.repository.CrudRepository;

import com.revature.Project2.beans.UserCategory;

/**
 * CrudRepository for UserCategory Bean
 */
public interface UserCategoryRepo extends CrudRepository<UserCategory, Integer> {

	// Custom Crud method to get all user categories by a user id
	public Iterable<UserCategory> findAllByUId(int uId);

}
