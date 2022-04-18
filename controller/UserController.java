package com.capgemini.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.capgemini.springboot.entity.User;
import com.capgemini.springboot.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public String add(@RequestBody User user) {
		userService.saveUser(user);
		return "New user added";
	}
	
	@GetMapping("/getAllUsers")
	public List<User> list(){
		return userService.getAllUsers();
	}
}
