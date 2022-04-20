package com.pms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pms.models.Drug;

public interface DrugRepository extends MongoRepository<Drug, Integer>{

}
