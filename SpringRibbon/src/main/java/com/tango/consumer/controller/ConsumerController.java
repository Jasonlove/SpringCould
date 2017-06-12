package com.tango.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tango.consumer.service.ComputeService;

/**
 * Created by XJJ-PC on 2017-05-10.
 */
@RestController
public class ConsumerController {
	
	
    @Autowired
    private ComputeService computeService;
    
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService();
    }
}