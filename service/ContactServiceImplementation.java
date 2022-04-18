package com.capgemini.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springboot.entity.Contact;
import com.capgemini.springboot.repository.ContactRepository;

import java.util.List;

@Service
public class ContactServiceImplementation implements ContactService {
	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public Contact saveContact(Contact contact) {
		return contactRepository.save(contact);
	}
	
	@Override
	public List<Contact> getAllContacts(){
		return contactRepository.findAll();
	}

}