package user_Dealer.resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import user_Dealer.repository.DealerRepository;
import user_Dealer.model.Dealer;

import java.util.List;

@EnableEurekaClient
@RestController
@RequestMapping(value= "/dealer")
public class DealerResource {
    @Autowired
    private DealerRepository dealerRepository;
    @Autowired
    private RestTemplate restTemplate;
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
    public Dealer getDealer1(@PathVariable int id){
        return dealerRepository.findById(id).get();
    }
    @DeleteMapping("/delete/{dealerid}")
    public String delete(@PathVariable int dealerid){
        dealerRepository.deleteById(dealerid);
        return "Book deleted with id: " + dealerid;
    }
    @PutMapping("/update/{id}")
    public String getDealer2(@RequestBody Dealer dealer) {
        dealerRepository.save(dealer);
        return "Dealer updated with id: " + dealer.getDealerid();
    }
    @PutMapping("/edit/{id}")
    public String getDealer3(@RequestBody Dealer dealer){
        dealerRepository.save(dealer);
        return "Dealer edited with id:" + dealer.getDealerid();
    }
    @PutMapping("/view/{id}")
    public String getDealer4(@RequestBody Dealer dealer) {
        dealerRepository.save(dealer);
        return "Dealer is viewing his profile with id:" + dealer.getDealerid();
    }
    @PutMapping("/activate/{id}")
    public String getDealer5(@RequestBody Dealer dealer) {
        dealerRepository.save(dealer);
        return "Dealer activated with id:" + dealer.getDealerid();
    }
    @PutMapping("/inactivate/{id}")
    public String getDealer6(@RequestBody Dealer dealer) {
        dealerRepository.save(dealer);
        return "Dealer inactivated with id:" + dealer.getDealerid();
    }
}
