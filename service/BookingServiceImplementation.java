package com.capgemini.springboot.service;



import com.capgemini.springboot.entity.Booking;
import com.capgemini.springboot.repository.BookingRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImplementation implements BookingService {
	
@Autowired
	private BookingRepository userRepository;
	
	@Override
	public Booking saveBooking(Booking booking) {
		return userRepository.save(booking);
	}
	
	@Override
	public List<Booking> getAllBooking(){
		return userRepository.findAll();
	}

}