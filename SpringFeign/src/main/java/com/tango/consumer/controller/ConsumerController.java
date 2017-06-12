package com.tango.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tango.consumer.service.ComputeClient;

/**
 * Created by XJJ-PC on 2017-05-10.
 */
@RestController
public class ConsumerController {
	
    @Autowired
    ComputeClient computeClient;
    
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(10, 20);
    }
    
}