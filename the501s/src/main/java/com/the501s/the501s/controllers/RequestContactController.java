package com.the501s.the501s.controllers;

import com.the501s.the501s.models.RequestContact;
import com.the501s.the501s.repositories.RequestContactRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
public class RequestContactController {

    @Autowired
    private RequestContactRepo requestRepo;

    @PostMapping("/create")
    public RequestContact createRequestContact(@RequestBody RequestContact requestContact) {
        return requestRepo.save(requestContact);
    }   
    
}