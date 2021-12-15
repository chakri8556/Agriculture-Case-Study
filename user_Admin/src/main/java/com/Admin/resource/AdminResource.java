package com.Admin.resource;


import com.Admin.model.Crop;
import com.Admin.model.Dealer;
import com.Admin.model.Farmer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminResource{
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public String userLoginValidation() {
        return "Hello From Admin MicroService!";
    }

    @GetMapping(value = "/findfarmer/{userid}")
    public Farmer getfarmerdetails(@PathVariable int userid) {
        Farmer farmer = restTemplate.getForObject("http://localhost:9001/farmer/findfarmer/" + userid, Farmer.class);
        return farmer;
    }

    @RequestMapping(value = "/finddealer/{userid}")
    public Dealer getdealerdetails(@PathVariable int userid) {
        Dealer dealer = restTemplate.getForObject("http://localhost:9002/dealer/finddealer/" + userid, Dealer.class);
        return dealer;
    }

    @RequestMapping(value = "/findcrop/{userid}")
    public Crop getcropdetails(@PathVariable int userid) {
        Crop crop = restTemplate.getForObject("http://localhost:9004/crop/findcrop/" + userid, Crop.class);
        return crop;
    }

    @GetMapping("/findAllfarmer")
    public List<Farmer> getAllfarmers() {
        return Arrays.asList(restTemplate.getForObject("http://localhost:9001/farmer/findAllfarmer", Farmer[].class));
    }

    @GetMapping("/findAlldealer")
    public List<Dealer> getAlldealers() {
        return Arrays.asList(restTemplate.getForObject("http://localhost:9002/dealer/findAlldealer", Dealer[].class));
    }

    @GetMapping("/findAllcrop")
    public List<Crop> getAllcrops() {
        return Arrays.asList(restTemplate.getForObject("http://localhost:9004/crop/findAllcrop", Crop[].class));
    }

    @RequestMapping("/deletefarmer/{farmerid}")
    public Boolean deleteFarmerById(@PathVariable String farmerid) {
        restTemplate.delete("http://localhost:9001/farmer/delete/" + farmerid);
        return true;
    }

    @RequestMapping("/deletedealer/{dealerid}")
    public Boolean deleteDealerById(@PathVariable int dealerid) {
        restTemplate.delete("http://localhost:9002/dealer/delete/" + dealerid);
        return true;
    }

    @RequestMapping("/deletecrop/{cropid}")
    public Boolean deleteCropById(@PathVariable int cropid) {
        restTemplate.delete("http://localhost:9004/crop/delete/" + cropid);
        return true;
    }

    @RequestMapping("updatefarmer/{farmerid}")
    public String updatefarmer(@PathVariable int farmerid, @RequestBody Farmer farmer) {
        RestTemplate resTemplate = new RestTemplate();
        return resTemplate.postForObject("http://localhost:9001/farmer/update/" + farmerid, farmer, String.class);
    }

    @RequestMapping("updatedealer/{dealerid}")
    public String updatedealer(@PathVariable int dealerid, @RequestBody Dealer dealer) {
        RestTemplate resTemplate = new RestTemplate();
        return resTemplate.postForObject("http://localhost:9002/dealer/update/" + dealerid, dealer, String.class);
    }

    @RequestMapping("updatecrop/{cropid}")
    public String updatecrop(@PathVariable int cropid, @RequestBody Crop crop) {
        RestTemplate resTemplate = new RestTemplate();
        return resTemplate.postForObject("http://localhost:9004/crop/update/" + cropid, crop, String.class);
    }
    @PostMapping("/addfarmer")
    public String addfarmer(@RequestBody Farmer farmer) {
        String msg = restTemplate.postForObject("http://localhost:9001/farmer/addfarmer", farmer, String.class);
        return msg;
    }
    @PostMapping("/adddealer")
    public String adddealer(@RequestBody Dealer dealer) {
        String msg1 = restTemplate.postForObject("http://localhost:9002/dealer/adddealer", dealer, String.class);
        return msg1;
    }
    @PostMapping("/addcrop")
    public String addcrop(@RequestBody Crop crop) {
        String msg2 = restTemplate.postForObject("http://localhost:9004/crop/addcrop", crop, String.class);
        return msg2;
    }


}






