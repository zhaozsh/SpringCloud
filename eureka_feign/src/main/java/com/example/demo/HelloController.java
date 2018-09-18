package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    ServiceHello serviceHello;

    @GetMapping(value = "/hello")
    public String hello() {
        return serviceHello.showHello();
    }
}
