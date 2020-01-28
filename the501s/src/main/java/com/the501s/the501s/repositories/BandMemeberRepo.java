package com.the501s.the501s.repositories;

import com.the501s.the501s.models.BandMember;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BandMemeberRepo extends MongoRepository<BandMember, String> {

    
}