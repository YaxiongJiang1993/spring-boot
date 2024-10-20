package com.davih.controller;

import com.davih.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Lazy
	@Autowired
	private UserService userService;

	@GetMapping("/test")
	public String test(){
		return this.userService.test();
	}
}
