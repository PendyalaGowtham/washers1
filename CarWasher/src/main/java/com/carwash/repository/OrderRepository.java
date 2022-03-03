package com.carwash.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.model.Order;

public interface OrderRepository extends MongoRepository<Order, Integer> {

}
