package com.tango.consumer.service;

import org.springframework.web.bind.annotation.RequestParam;

public class ComputeClientHystrix implements ComputeClient {

	@Override
	 public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }

}
