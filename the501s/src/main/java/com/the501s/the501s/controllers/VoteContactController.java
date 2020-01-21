package com.the501s.the501s.controllers;

import java.util.List;

import com.the501s.the501s.models.VoteContact;
import com.the501s.the501s.repositories.VoteContactRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/vote")
public class VoteContactController {

    @Autowired
    private VoteContactRepo voteContactRepo;

    @PostMapping("/create")
    public VoteContact createContact(@RequestBody VoteContact voteContact) {
        return voteContactRepo.save(voteContact);
    }

    @GetMapping(value="/getAll")
    public List<VoteContact> getMAll() {
        return voteContactRepo.findAll();
    }
    

}