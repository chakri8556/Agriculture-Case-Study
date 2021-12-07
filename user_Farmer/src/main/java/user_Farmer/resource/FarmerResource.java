package user_Farmer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;
import user_Farmer.model.Farmer;
import user_Farmer.repository.FarmerRepository;

import java.util.List;
import java.util.Optional;

@EnableEurekaClient
@RestController
@RequestMapping(value = "/farmer")
public class FarmerResource {

    @Autowired
    private FarmerRepository farmerRepository;

    @RequestMapping(value = "/login/f" ,method = RequestMethod.GET)
    public String userLoginValidation() {
        return "Hello From Farmer MicroService!";
    }
    @PostMapping("/addfarmer")
    public String saveFarmer(@RequestBody Farmer farmer) {
        farmerRepository.save(farmer);
        return "Add farmer with id:" + farmer.getFarmerid();
    }
    @GetMapping("/findAllfarmer")
    public List<Farmer> getFarmer() {
        return farmerRepository.findAll();
    }
    @GetMapping("/findAllfarmer/{id}")
    public Optional<Farmer> getFarmer(@PathVariable int farmerid) {
        return farmerRepository.findById(farmerid);
    }
    @DeleteMapping("/delete/{id}") public String deleteBook(@PathVariable int id) {
        farmerRepository.deleteById(id);
        return "book deleted with id : " + id;
    }



}
