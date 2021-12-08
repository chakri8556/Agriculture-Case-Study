package user_Dealer.resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;
import user_Dealer.repository.DealerRepository;
import user_Dealer.model.Dealer;

import java.util.List;

@EnableEurekaClient
@RestController
@RequestMapping(value= "/dealer")
public class DealerResource {
    @Autowired
    private DealerRepository dealerRepository;

    @RequestMapping(value= "/d" ,method = RequestMethod.GET)
    public String userLoginValidation() {
        return "Hello From Dealer MicroService!";
    }
    @PostMapping("/adddealer")
    public String saveDealer(@RequestBody Dealer dealer){
        dealerRepository.save(dealer);
        return "Added dealer with id:" + dealer.getDealerid();
    }
    @GetMapping("/findAlldealer")
    public List<Dealer> getDealer(){
        return dealerRepository.findAll();
    }
    @GetMapping("/findonedealer/{id}")
    public Dealer getDealer(@PathVariable int id){
        return dealerRepository.findById(id).get();
    }
    @DeleteMapping("/delete{id}")
    public String deleteBook(@PathVariable int id){
        dealerRepository.deleteById(id);
        return "Book deleted with id: " + id;
    }
}
