package com.capgemini.springboot.repository;

import org.springframework.stereotype.Repository;

import com.capgemini.springboot.entity.Fleet;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FleetRepository extends JpaRepository<Fleet, Integer> {

}