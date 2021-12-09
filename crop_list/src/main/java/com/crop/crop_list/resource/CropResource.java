package com.crop.crop_list.resource;


import com.crop.crop_list.model.Crop;
import com.crop.crop_list.repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/crop")
public class CropResource {
    @Autowired
    private CropRepository cropRepository;

    @RequestMapping(value = "/c", method = RequestMethod.GET)
    public String userLoginValidation() {
        return "Hello From Crop MicroService";

    }

    @PostMapping("/addcrop")
    public String saveCrop(@RequestBody Crop crop) {
        cropRepository.save(crop);
        return "Added Crop with id:" + crop.getCropid();
    }

    @GetMapping("/findAllcrop")
    public List<Crop> getCrop() {
        return cropRepository.findAll();
    }

    @GetMapping("/findonecrop/{id}")
    public Crop getCrop(@PathVariable int id) {
        return cropRepository.findById(id).get();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        cropRepository.deleteById(id);
        return "Book deleted with id : " + id;
    }
}


