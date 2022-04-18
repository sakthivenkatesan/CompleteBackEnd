package com.capgemini.springboot.repository;

import org.springframework.stereotype.Repository;

import com.capgemini.springboot.entity.Booking;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

	

}