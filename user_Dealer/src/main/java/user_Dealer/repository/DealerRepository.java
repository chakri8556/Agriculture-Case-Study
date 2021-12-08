package user_Dealer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import user_Dealer.model.Dealer;

public interface DealerRepository extends MongoRepository<Dealer,Integer> {
}
