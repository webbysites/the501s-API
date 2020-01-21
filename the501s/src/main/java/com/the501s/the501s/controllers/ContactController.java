package com.the501s.the501s.controllers;

import java.util.List;

import com.the501s.the501s.models.Contact;
import com.the501s.the501s.repositories.ContactRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactRepo contactRepo;

    @PostMapping("/create")
    public Contact createContact(@RequestBody Contact contact) {
        return contactRepo.save(contact);
    }

    @GetMapping(value="getAll")
    public List<Contact> getAll() {
        return contactRepo.findAll();
    }
    
    
}