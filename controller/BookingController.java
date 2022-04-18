package com.capgemini.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.capgemini.springboot.entity.Booking;
import com.capgemini.springboot.service.BookingService;

import java.util.List;

@RestController
@RequestMapping("/booking")
@CrossOrigin
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/addBooking")
	public String add(@RequestBody Booking booking) {
		bookingService.saveBooking(booking);
		return "New booking added";
	}
	
	@GetMapping("/getAllBooking")
	public List<Booking> list(){
		return bookingService.getAllBooking();
	}
}