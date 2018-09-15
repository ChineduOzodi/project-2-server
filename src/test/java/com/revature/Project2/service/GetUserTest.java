package com.revature.Project2.service;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;

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

//THIS TEST DOES NOT WORK YET


	//Here We let Spring know that we will be using mock objects
	@RunWith(MockitoJUnitRunner.class)

	/*Instructs our JUnit test  to not load any of our 
	web environment or any of our controller components.*/
	@SpringBootTest(webEnvironment = WebEnvironment.NONE)
	public class GetUserTest {
		
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
		public void testGetUser() {
			
			//Create a new user
			User user = new User();
			user.setuId(74);
			
			
			/*
			 * When a uRepo receives a call on 
			 * its save method for any customer contact class then 
			 * simply return the mock object
			 */
			when(urepo.save(any(User.class))).thenReturn(user);
			
			//Save the user
			Optional<User> newUser = userService.uRepo.findById(74);
			System.out.println(newUser);
			
			//Verify the save
			assertEquals(74, newUser.get());
			System.out.println(newUser);
	
			

			
		}

		
	}