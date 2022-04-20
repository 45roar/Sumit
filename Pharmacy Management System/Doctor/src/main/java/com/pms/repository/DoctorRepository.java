package com.pms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pms.models.Doctor;

public interface DoctorRepository extends MongoRepository<Doctor, Integer> {

}
