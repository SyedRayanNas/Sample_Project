package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;


@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {
	
	@Autowired
    private  UserService userService; // Use final to enforce proper injection

 
	@GetMapping("/getDetails")
	public Object getUserDetails() {
		
		return userService.getUserDetails() ;
		
		
		
	}

}
