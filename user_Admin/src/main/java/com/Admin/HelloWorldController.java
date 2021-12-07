package com.Admin;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@EnableEurekaClient
@RestController
@RequestMapping(value = "/admin")
public class HelloWorldController {
    @RequestMapping(value= "/login/a",method = RequestMethod.GET)
    public String userLoginValidation(){
        return "Hello From Admin MicroService!";
    }
}
