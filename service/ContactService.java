package com.capgemini.springboot.service;

import java.util.List;

import com.capgemini.springboot.entity.Contact;

public interface ContactService {
	public Contact saveContact(Contact contact);

	public List<Contact> getAllContacts();


}