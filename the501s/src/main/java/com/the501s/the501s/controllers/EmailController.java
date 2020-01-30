package com.the501s.the501s.controllers;

import com.the501s.the501s.models.Email;
import com.the501s.the501s.services.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class EmailController {

    @Autowired
    public EmailService emailservice;

    @PostMapping("/sendContactFormMail")
    @ResponseBody
    private String sendContactFormEmail(@RequestBody Email email) {
        try {
            emailservice.SendContactFormEmail(email);
            return "Contact form email sent!";
        } catch(Exception ex) {
            return "Error in sending email: " + ex;
        }
    
    }

    @PostMapping("/sendVotingFormEmail")
    private String sendVotingFormEmal(@RequestBody Email email) {
        try {
            emailservice.SendVotingFormEmail(email);
            return "voting form email sent";
        } catch(Exception e) {
            return "Error in sending mail" + e;
        }
    }

    @PostMapping("/sendRequestFormEmail")
    private String sendRequestFormEmail(@RequestBody Email email) {
        try {
            emailservice.SendRequestFormEmail(email);
            return "request form email sent";
        } catch(Exception e) {
            return "Error in sending email" + e;
        }
    }
}