package com.capgemini.springboot.service;

import java.util.List;

import com.capgemini.springboot.entity.Location;

public interface LocationService {
	
	public Location saveLocation(Location location);

	public List<Location> getAllLocations();

}