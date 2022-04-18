package com.capgemini.springboot.repository;

import org.springframework.stereotype.Repository;

import com.capgemini.springboot.entity.Passenger;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}