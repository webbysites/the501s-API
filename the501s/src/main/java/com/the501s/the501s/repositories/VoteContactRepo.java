package com.the501s.the501s.repositories;

import com.the501s.the501s.models.VoteContact;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VoteContactRepo extends MongoRepository<VoteContact, String> {
    
}