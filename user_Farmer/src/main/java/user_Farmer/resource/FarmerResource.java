package user_Farmer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import user_Farmer.model.Farmer;
import user_Farmer.repository.FarmerRepository;


import java.util.List;

@EnableEurekaClient //For registering on eureka server
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/farmer")
public class FarmerResource {

    @Autowired
    private FarmerRepository farmerRepository;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/f", method = RequestMethod.GET)
    public String userLoginValidation() {
        return "Hello From Farmer MicroService!";
    }
    // Adding new farmer
    @PostMapping("/addfarmer")
    public String saveFarmer(@RequestBody Farmer farmer) {
        farmerRepository.save(farmer);
        return "Added farmer with id:" + farmer.getFarmerid();
    }
    // Getting List of All farmers
    @GetMapping("/findAllfarmer")
    public List<Farmer> getFarmer() {
        return farmerRepository.findAll();
    }
    // Getting data of farmer using particular id
    @GetMapping("/findfarmer/{byid}")
    public Farmer getFarmer1(@PathVariable int byid) {
        return farmerRepository.findById(byid).get();
    }
    // Getting data of farmer by name
    @GetMapping(value = "/byname/{farmername}")
    public List<Farmer> getFarmer(@PathVariable String farmername){
        return farmerRepository.findByFarmername(farmername);
    }
    // Getting data of farmer by location
    @GetMapping(value = "/bylocation/{farmername}")
    public List<Farmer> getFarmerlocation(@PathVariable String farmername){
        return farmerRepository.findByFarmername(farmername);
    }
    // Deleting data of particular farmer
    @DeleteMapping("/delete/{byid}")
    public String deleteBook(@PathVariable int byid) {
        farmerRepository.deleteById(byid);
        return "Book deleted with id : " + byid;
    }
    // For updating the details of farmer
    @PutMapping("/update/{id}")
    public String getFarmer2(@RequestBody Farmer farmer) {
        farmerRepository.save(farmer);
        return "Farmer updated with id:" + farmer.getFarmerid();
    }
    //For editing details of farmer
    @PutMapping("/edit/{id}")
    public String getFarmer3(@RequestBody Farmer farmer){
        farmerRepository.save(farmer);
        return "Farmer edited with id:" + farmer.getFarmerid();
    }
    //For viewing the farmer details using id
    @PutMapping("/view/{id}")
    public String getFarmer4(@RequestBody Farmer farmer){
        farmerRepository.save(farmer);
        return "Farmer is viewing his profile with id:" + farmer.getFarmerid();
    }
    //For activating particular farmer by id
    @PutMapping("/activate/{id}")
    public String getFarmer5(@RequestBody Farmer farmer) {
        farmerRepository.save(farmer);
        return "Farmer activated with id:" + farmer.getFarmerid();
    }
    //For inactivating particular farmer by id
    @PutMapping("/inactivate/{id}")
    public String getFarmer6(@RequestBody Farmer farmer) {
        farmerRepository.save(farmer);
        return "Farmer inactivated with id:" + farmer.getFarmerid();
    }

}








