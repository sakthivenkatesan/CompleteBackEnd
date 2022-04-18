package com.capgemini.springboot.repository;

import org.springframework.stereotype.Repository;

import com.capgemini.springboot.entity.Location;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}