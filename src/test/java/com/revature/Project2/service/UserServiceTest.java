package com.revature.Project2.service;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.revature.Project2.beans.User;
import com.revature.Project2.repository.UserRepo;

/**
 * 
 * @author christopherholmes
 *
 */

//Here We let Spring know that we will be using mock objects
@RunWith(MockitoJUnitRunner.class)

/*Instructs our JUnit test  to not load any of our 
web environment or any of our controller components.*/
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class UserServiceTest {
	
	/**
	 * This is the only @mock we need here, this is how we access the DB
	 *  and get data in and out. We mock it because that 
	 *  component isn't ready yet
	 */
	@Mock 
	UserRepo urepo;
	
	/**
	* Lets the Junit runtime environment know to inject 
	* the mocks that we need onto this service 
	*/
	@InjectMocks
	private UserService userService;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	
	@Test
	public void testCreateUser() {
		
		//Create a new user
		User user = new User();
		user.setFirstname("Monta");
		user.setLastname("Ellis");
		
		/*
		 * When a uRepo receives a call on 
		 * its save method for any customer contact class then 
		 * simply return the mock object
		 */
		when(urepo.save(any(User.class))).thenReturn(user);
		
		//Save the user
		User newUser = userService.uRepo.save(new User());
		System.out.println(newUser);
		
		//Verify the save
		assertEquals("Monta", newUser.getFirstname());
		
		/*
		 * 	We want to see whether or not we get back the user 
		 * object with Monta's information in it.
		 * So we do an assert equals and just as the 
		 * last time we did an assert equals, I'm just going 
		 * to check for the first name. I want to assert that 
		 * the new user that comes back after my user service's 
		 * add method is called, it should return a new 
		 * contact with a first name value is indeed Jenny.
		 */

		
	}

	
}
