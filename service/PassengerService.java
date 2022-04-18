package com.capgemini.springboot.service;

import java.util.List;

import com.capgemini.springboot.entity.Passenger;

public interface PassengerService {
	
	public Passenger savePassenger(Passenger passenger);

	public List<Passenger> getAllPassenger();

}