package user_Dealer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import user_Dealer.model.Dealer;

import java.util.List;

public interface DealerRepository extends MongoRepository<Dealer,Integer> {
    List<Dealer> findBydealername(String dealername);


}
