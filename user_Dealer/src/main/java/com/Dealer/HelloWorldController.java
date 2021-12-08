package com.Dealer;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@EnableEurekaClient
@RestController
@RequestMapping(value= "/dealer")
public class HelloWorldController {
    @RequestMapping(value= "/d" ,method = RequestMethod.GET)
    public String userLoginValidation() {
        return "Hello From Dealer MicroService!";
    }
}
