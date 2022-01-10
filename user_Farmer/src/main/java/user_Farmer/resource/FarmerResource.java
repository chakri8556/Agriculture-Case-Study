package user_Farmer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import user_Farmer.model.Farmer;
import user_Farmer.repository.FarmerRepository;


import java.util.List;

@EnableEurekaClient
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

    @PostMapping("/addfarmer")
    public String saveFarmer(@RequestBody Farmer farmer) {
        farmerRepository.save(farmer);
        return "Added farmer with id:" + farmer.getFarmerid();
    }

    @GetMapping("/findAllfarmer")
    public List<Farmer> getFarmer() {
        return farmerRepository.findAll();
    }

    @GetMapping("/findfarmer/{byid}")
    public Farmer getFarmer1(@PathVariable int byid) {
        return farmerRepository.findById(byid).get();
    }

    @GetMapping(value = "/byname/{farmername}")
    public List<Farmer> getFarmer(@PathVariable String farmername){
        return farmerRepository.findByFarmername(farmername);
    }
    @GetMapping(value = "/bylocation/{farmername}")
    public List<Farmer> getFarmerlocation(@PathVariable String farmername){
        return farmerRepository.findByFarmername(farmername);
    }

    @DeleteMapping("/delete/{byid}")
    public String deleteBook(@PathVariable int byid) {
        farmerRepository.deleteById(byid);
        return "Book deleted with id : " + byid;
    }

    @PutMapping("/update/{id}")
    public String getFarmer2(@RequestBody Farmer farmer) {
        farmerRepository.save(farmer);
        return "Farmer updated with id:" + farmer.getFarmerid();
    }
    @PutMapping("/edit/{id}")
    public String getFarmer3(@RequestBody Farmer farmer){
        farmerRepository.save(farmer);
        return "Farmer edited with id:" + farmer.getFarmerid();
    }
    @PutMapping("/view/{id}")
    public String getFarmer4(@RequestBody Farmer farmer){
        farmerRepository.save(farmer);
        return "Farmer is viewing his profile with id:" + farmer.getFarmerid();
    }
    @PutMapping("/activate/{id}")
    public String getFarmer5(@RequestBody Farmer farmer) {
        farmerRepository.save(farmer);
        return "Farmer activated with id:" + farmer.getFarmerid();
    }
    @PutMapping("/inactivate/{id}")
    public String getFarmer6(@RequestBody Farmer farmer) {
        farmerRepository.save(farmer);
        return "Farmer inactivated with id:" + farmer.getFarmerid();
    }

}








