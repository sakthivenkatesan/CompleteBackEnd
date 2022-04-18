package com.capgemini.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.capgemini.springboot.entity.Fleet;
import com.capgemini.springboot.service.FleetService;

@RestController
@RequestMapping("/fleet")
@CrossOrigin
public class FleetController {
	@Autowired
	private FleetService fleetService;
	
	@PostMapping("/addFleet")
	public String add(@RequestBody Fleet fleet) {
		fleetService.saveFleet(fleet);
		return "New fleet added";
	}
	
}