package com.the501s.the501s.repositories;

import com.the501s.the501s.models.RequestContact;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RequestContactRepo extends MongoRepository<RequestContact, String> {

    
}