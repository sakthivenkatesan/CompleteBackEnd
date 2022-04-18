package com.capgemini.springboot.repository;


import org.springframework.stereotype.Repository;

import com.capgemini.springboot.entity.Contact;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}