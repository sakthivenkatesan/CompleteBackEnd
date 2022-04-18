package com.capgemini.springboot.repository;

import org.springframework.stereotype.Repository;

import com.capgemini.springboot.entity.SignUp;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SignUpRepository extends JpaRepository<SignUp, Integer> {

}
