package com.capgemini.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name="booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	private long bookingNumber;
	private int bookingDate;
	private int travelDate;
	private double totalCost;
	

	public Booking() {
		
	}
		
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public long getBookingNumber() {
		return bookingNumber;
	}
	public void setBookingNumber(long bookingNumber) {
		this.bookingNumber = bookingNumber;
	}
	public int getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(int bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(int travelDate) {
		this.travelDate = travelDate;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
}