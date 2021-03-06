package com.crop.crop_list.resource;


import com.crop.crop_list.model.Crop;
import com.crop.crop_list.repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@EnableEurekaClient
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/crop")
public class CropResource {
    @Autowired
    private CropRepository cropRepository;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/c", method = RequestMethod.GET)
    public String userLoginValidation() {
        return "Hello From Crop MicroService";

    }
    //Adding crop
    @PostMapping("/addcrop")
    public String saveCrop(@RequestBody Crop crop) {
        cropRepository.save(crop);
        return "Added Crop with id:" + crop.getCropid();
    }
    //Finding all crops
    @GetMapping("/findAllcrop")
    public List<Crop> getCrop() {
        return cropRepository.findAll();
    }
    //Finding crop using id
    @GetMapping("/findcrop/{byid}")
    public Crop getCrop(@PathVariable int byid) {
        return cropRepository.findById(byid).get();
    }
    //Deleting available crops
    @DeleteMapping("/delete/{cropid}")
    public String deleteBook(@PathVariable int cropid) {
        cropRepository.deleteById(cropid);
        return "Book deleted with id : " + cropid;
    }
    //Updating crop using id
    @PutMapping("/update/{id}")
    public String getcrop1(@RequestBody Crop crop) {
        cropRepository.save(crop);
        return "Crop updated with id:" + crop.getCropid();
    }
    //editing particular crop
    @PutMapping("/edit/{id}")
    public String getcrop2(@RequestBody Crop crop) {
        cropRepository.save(crop);
        return "Crop edited with id:" + crop.getCropid();
    }
}


