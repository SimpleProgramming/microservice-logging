package com.springboot.controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LoggingController {

	private static final Logger LOG = Logger.getLogger(LoggingController.class.getName());

	@GetMapping("/ping")
	public String getResponse1(@RequestParam("name") String name) {
		LOG.debug("RequestParam - " + name);
		return name + " - " + new Date();
	}
	
	@GetMapping("/fetch")
	public String getResponse2() throws InterruptedException {
		Thread.sleep(3000);
		return "hello";
	}

	@GetMapping("/exception")
	public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            LOG.error("Exception - ", e);
        }
	}
}