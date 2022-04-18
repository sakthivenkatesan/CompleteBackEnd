package com.capgemini.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.capgemini.springboot.entity.Location;
import com.capgemini.springboot.service.LocationService;

import java.util.List;

@RestController
@RequestMapping("/location")
@CrossOrigin
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@PostMapping("/addLocation")
	public String add(@RequestBody Location location) {
		locationService.saveLocation(location);
		return "New location added";
	}
	
	@GetMapping("/getAllLocations")
	public List<Location> list(){
		return locationService.getAllLocations();
	}
}