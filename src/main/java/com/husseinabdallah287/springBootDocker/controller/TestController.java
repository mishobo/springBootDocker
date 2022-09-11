package com.husseinabdallah287.springBootDocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test/")
public class TestController {
	
	  @RequestMapping("/hello")
	  public String home() {
	    return "Hello Docker World";
	  }

}
