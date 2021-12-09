package com.crop.crop_list.repository;


import com.crop.crop_list.model.Crop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CropRepository extends MongoRepository<Crop,Integer> {
}
