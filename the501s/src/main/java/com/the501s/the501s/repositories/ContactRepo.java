package com.the501s.the501s.repositories;

import com.the501s.the501s.models.Contact;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepo extends MongoRepository<Contact, String> {

}