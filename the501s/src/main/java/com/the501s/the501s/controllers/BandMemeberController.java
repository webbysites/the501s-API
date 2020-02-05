package com.the501s.the501s.controllers;

import java.util.List;

import com.the501s.the501s.models.BandMember;
import com.the501s.the501s.repositories.BandMemeberRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BandMemeberController {

    @Autowired
    private BandMemeberRepo bandMemberRepo;

    @RequestMapping(value = "/members", method = RequestMethod.GET)
    public List<BandMember> getAll() {
        return bandMemberRepo.findAll();
    }
    
    
}