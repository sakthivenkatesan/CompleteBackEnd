package com.capgemini.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springboot.entity.Fleet;
import com.capgemini.springboot.repository.FleetRepository;

@Service
public class FleetServiceImplementation implements FleetService {
	
	@Autowired
	private FleetRepository userRepository;
	
	public Fleet saveFleet(Fleet fleet) {
		return userRepository.save(fleet);
	}	
}