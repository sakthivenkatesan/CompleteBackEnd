package com.capgemini.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.capgemini.springboot.entity.Passenger;
import com.capgemini.springboot.service.PassengerService;

import java.util.List;

@RestController
@RequestMapping("/passenger")
@CrossOrigin
public class PassengerController {
	@Autowired
	private PassengerService passengerService;
	
	@PostMapping("/addPassenger")
	public String add(@RequestBody Passenger passenger) {
		passengerService.savePassenger(passenger);
		return "New Passenger added";
	}
	
	@GetMapping("/getAllPassenger")
	public List<Passenger> list(){
		return passengerService.getAllPassenger();
	}
}