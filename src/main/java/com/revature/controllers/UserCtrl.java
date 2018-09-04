package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserCtrl {
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("welcome home spring");
		return "Hello Spring";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginGET() {
		System.out.println("GET -welcome home spring");
		return "GET Spring";
	}

}
