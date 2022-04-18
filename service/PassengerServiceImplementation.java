package com.capgemini.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springboot.entity.Passenger;
import com.capgemini.springboot.repository.PassengerRepository;

import java.util.List;

@Service
public class PassengerServiceImplementation implements PassengerService {
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	@Override
	public Passenger savePassenger(Passenger passenger) {
		return passengerRepository.save(passenger);
	}
	
//	@Override
//	public Passenger updatePassenger(Passenger passenger) {
//		return passengerRepository.save(passenger));
//	}
	
	@Override
	public List<Passenger> getAllPassenger(){
		return passengerRepository.findAll();
	}

}