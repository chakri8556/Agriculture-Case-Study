package user_Farmer.repository;

import user_Farmer.model.Farmer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FarmerRepository extends MongoRepository<Farmer,Integer> {

    List<Farmer> findByFarmername(String name);

}
