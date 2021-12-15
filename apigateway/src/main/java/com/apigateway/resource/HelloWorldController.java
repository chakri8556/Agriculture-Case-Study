package com.apigateway.resource;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@RequestMapping(value = "/api")
public class HelloWorldController {
    @RequestMapping(value = "/gateway",method = RequestMethod.GET)
    public String userLoginValidation() {
        return "Hello From Api-gateway MicroService!";
    }
}
