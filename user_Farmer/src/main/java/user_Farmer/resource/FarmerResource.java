package user_Farmer.resource;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import user_Farmer.model.Farmer;
import user_Farmer.repository.FarmerRepository;

import java.util.List;

@EnableEurekaClient
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

    @Operation(summary = "Add farmer", description = "Get a list of farmers", tags = "Get")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Added the Farmer",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Farmer.class))}),
            @ApiResponse(responseCode = "404", description = "Farmer not Added" +
                    "",
                    content = @Content)})
    @PostMapping("/addfarmer")
    public String saveFarmer(@RequestBody Farmer farmer) {
        farmerRepository.save(farmer);
        return "Added farmer with id:" + farmer.getFarmerid();
    }

    @GetMapping("/findAllfarmer")
    public List<Farmer> getFarmer() {
        return farmerRepository.findAll();
    }

    @GetMapping("/findfarmer/{id}")
    public Farmer getFarmer1(@PathVariable int id) {
        return farmerRepository.findById(id).get();
    }

    @DeleteMapping("/delete/{farmerid}")
    public String deleteBook(@PathVariable int farmerid) {
        farmerRepository.deleteById(farmerid);
        return "Book deleted with id : " + farmerid;
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







