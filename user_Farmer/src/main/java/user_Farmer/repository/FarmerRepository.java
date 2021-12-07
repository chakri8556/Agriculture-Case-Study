package user_Farmer.repository;

import user_Farmer.model.Farmer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FarmerRepository extends MongoRepository<Farmer,Integer> {

}
