package com.yyrj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yyrj.dao.CarRepository;
import com.yyrj.entity.Car;

@RestController
public class CarController {
	@Autowired
	private CarRepository carDao;
	
	@RequestMapping("/cars")
	public Iterable<Car> getCars()
	{
		return carDao.findAll();
	}
	
}
