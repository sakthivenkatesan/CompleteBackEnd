package com.capgemini.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.capgemini.springboot.entity.Contact;
import com.capgemini.springboot.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/contact")
@CrossOrigin
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping("/addContact")
	public String add(@RequestBody Contact contact) {
		contactService.saveContact(contact);
		return "New contact added";
	}
	
	@GetMapping("/getAllContacts")
	public List<Contact> list(){
		return contactService.getAllContacts();
	}
}