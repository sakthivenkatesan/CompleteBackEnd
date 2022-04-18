package com.capgemini.springboot.service;

import java.util.List;

import com.capgemini.springboot.entity.Booking;

public interface BookingService {
	
	public Booking saveBooking(Booking booking);

	public List<Booking> getAllBooking();

}