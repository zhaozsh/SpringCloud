package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-hello")
public interface ServiceHello {
	@RequestMapping(value = "/",method = RequestMethod.GET)
    String showHello();
}
