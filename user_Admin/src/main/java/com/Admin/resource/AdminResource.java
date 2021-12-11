package com.Admin.resource;

import com.Admin.model.Crop;
import com.Admin.model.Dealer;
import com.Admin.model.Farmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@EnableEurekaClient
@RestController
@RequestMapping(value = "/admin")
public class AdminResource {
    @Autowired
    private RestTemplate restTemplate;
    private Object String;

    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public String userLoginValidation() {
        return "Hello From Admin MicroService!";
    }

    @RequestMapping(value = "/farmer/{userid}")
    public Farmer getCatalog(@PathVariable int userid) {
        Farmer FarmerDetails = restTemplate.getForObject("http://localhost:9001/farmer/findonefarmer/" + userid, Farmer.class);
        return FarmerDetails;
    }

    @RequestMapping(value = "/dealer/{userid}")
    public Dealer getDealer(@PathVariable int userid) {
        Dealer DealerDetails = restTemplate.getForObject("http://localhost:9002/dealer/findonedealer/" + userid, Dealer.class);
        return DealerDetails;
    }

    @RequestMapping(value = "/crop/{userid}")
    public Crop getCrop(@PathVariable int userid) {
        Crop CropDetails = restTemplate.getForObject("http://localhost:9004/crop/findonecrop/" + userid, Crop.class);
        return CropDetails;
    }

    @GetMapping(value = "/findAllfarmer")
    public List<Farmer> Allfarmerdetails() {
        return Arrays.asList(restTemplate.getForObject("http://localhost:9001/farmer/findAllfarmer", Farmer[].class));
    }

    @GetMapping(value = "/findAlldealer")
    public List<Dealer> dealerdetails() {
        return Arrays.asList(restTemplate.getForObject("http://localhost:9002/dealer/findAlldealer", Dealer[].class));
    }

    @GetMapping(value = "/findAllcrop")
    public List<Crop> cropdetails() {
        return Arrays.asList(restTemplate.getForObject("http://localhost:9004/crop/findAllcrop", Crop[].class));
    }

    @DeleteMapping("/deletefarmer/{farmerid}")
    public Boolean deleteFarmerById(@PathVariable String farmerid) {
        restTemplate.delete("http://localhost:9001/farmer/delete/" + farmerid);
        return true;
    }

    @DeleteMapping("/deletedealer/{dealerid}")
    public Boolean deleteDealerById(@PathVariable String dealerid) {
        restTemplate.delete("http://localhost:9002/dealer/delete/" + dealerid);
        return true;
    }

    @DeleteMapping("/deletecrop/{cropid}")
    public Boolean deleteCropById(@PathVariable String cropid) {
        restTemplate.delete("http://localhost:9004/crop/delete/" + cropid);
        return true;
    }


}






