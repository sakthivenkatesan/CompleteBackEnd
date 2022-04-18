package com.capgemini.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.capgemini.springboot.entity.SignUp;
import com.capgemini.springboot.entity.User;
import com.capgemini.springboot.service.SignUpService;
import com.capgemini.springboot.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/signUp")
@CrossOrigin
public class SignUpController {
	@Autowired
	private SignUpService signUpService;
	
	@PostMapping("/addNewUser")
	public String add(@RequestBody SignUp signup) {
		signUpService.saveSignUp(signup);
		return "New user added";
	}
	
}
