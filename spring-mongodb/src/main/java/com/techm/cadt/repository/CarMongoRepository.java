package com.techm.cadt.repository;

import org.springframework.data.repository.CrudRepository;

import com.techm.cadt.model.Car;

public interface CarMongoRepository extends CrudRepository<Car, String>{}