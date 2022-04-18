package com.capgemini.springboot.service;

import java.util.List;

import com.capgemini.springboot.entity.User;

public interface UserService {
	
	public User saveUser(User user);

	public List<User> getAllUsers();

}
