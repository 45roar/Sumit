package com.pms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pms.models.Supplier;

public interface SupplierRepository extends MongoRepository<Supplier, Integer>{

}
