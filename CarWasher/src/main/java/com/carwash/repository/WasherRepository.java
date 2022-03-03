package com.carwash.repository;

import org.springframework.stereotype.Repository;
import com.carwash.model.Washer;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface WasherRepository extends MongoRepository<Washer, Integer> 
{
	Washer findBywEmail(String wEmail);

}
