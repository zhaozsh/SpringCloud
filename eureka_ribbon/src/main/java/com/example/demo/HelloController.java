package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;
	
    @GetMapping(value = "/hello")
    public String hi() {
        return restTemplate.getForObject("http://SERVICE-HELLO/",String.class);
    }
}
