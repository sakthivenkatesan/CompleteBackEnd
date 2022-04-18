package com.capgemini.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springboot.entity.Location;
import com.capgemini.springboot.repository.LocationRepository;

import java.util.List;

@Service
public class LocationServiceImplementation implements LocationService {
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public Location saveLocation(Location location) {
		return locationRepository.save(location);
	}
	
	@Override
	public List<Location> getAllLocations(){
		return locationRepository.findAll();
	}

}