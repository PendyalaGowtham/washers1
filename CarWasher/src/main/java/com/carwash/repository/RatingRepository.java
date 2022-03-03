package com.carwash.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.model.Ratings;

public interface RatingRepository extends MongoRepository<Ratings, Integer>  {

}
