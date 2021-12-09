package com.Admin.resource;

import com.Admin.model.Dealer;
import com.Admin.model.Farmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@RestController
@RequestMapping(value = "/admin")
public class AdminResource {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value= "/a",method = RequestMethod.GET)
    public String userLoginValidation(){
        return "Hello From Admin MicroService!";
    }
    @RequestMapping(value = "/{userid}")
    public Farmer getCatalog(@PathVariable int userid){
        Farmer FarmerDetails =  restTemplate.getForObject("http://localhost:9001/farmer/findonefarmer/"+userid, Farmer.class);
        return FarmerDetails;
    }
    @RequestMapping(value = "/{userid}")
    public Dealer getCatalog(@PathVariable int userid){
        Dealer DealerDetails = restTemplate.getForObject("http://localhost:9002/dealer/findAlldealer/"+userid, Dealer.class);
        return DealerDetails;
    }


}
