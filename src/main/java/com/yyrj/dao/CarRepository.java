package com.yyrj.dao;

import org.springframework.data.repository.CrudRepository;

import com.yyrj.entity.Car;

public interface CarRepository extends CrudRepository<Car, Long> {

}
