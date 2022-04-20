package com.pms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pms.models.Order;

public interface OrderRepository extends MongoRepository<Order, Integer> {

}
