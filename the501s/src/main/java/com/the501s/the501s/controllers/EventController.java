package com.the501s.the501s.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * EventController
 */
@CrossOrigin
@RestController
public class EventController {

    @Autowired
    private RestTemplate restTmeplate;

    @Value("${api.key}")
    private String token;

    @RequestMapping(value="/dates", method = RequestMethod.GET)
    public Object getEvents() {
        Object events = restTmeplate.getForObject(token, Object.class);
        // System.out.println(events);
        return events;
    }
    
    
}