package com.capgemini.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springboot.entity.SignUp;
import com.capgemini.springboot.entity.User;
import com.capgemini.springboot.repository.SignUpRepository;
import com.capgemini.springboot.repository.UserRepository;

import java.util.List;

@Service
public class SignUpServiceImplementation implements SignUpService {
	
	@Autowired
	private SignUpRepository signUpRepository;

	@Override
	public SignUp saveSignUp(SignUp signup) {
		return signUpRepository.save(signup);
	}
	

}
