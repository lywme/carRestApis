package com.yyrj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.yyrj.dao.CarRepository;
import com.yyrj.dao.OwnerRepository;
import com.yyrj.entity.Car;
import com.yyrj.entity.Owner;

@SpringBootApplication
public class CardataApplication {
	@Autowired
	CarRepository carDao;
	@Autowired
	OwnerRepository ownerDao;
	
	public static void main(String[] args) {
		SpringApplication.run(CardataApplication.class, args);
	}

	@Bean
	CommandLineRunner runner()
	{
		return (args)->{
			Owner owner1=new Owner("John","Johnson");
			ownerDao.save(owner1);
			Owner owner2=new Owner("Mary","Robinson");
			ownerDao.save(owner2);
			
			
			carDao.save(new Car("Ford","Mustang","Red","ADF-1121",2017,59000,owner1));
			carDao.save(new Car("Nissan","Leaf","White","SSJ-3002",2014,29000,owner2));
			carDao.save(new Car("Toyota","Prius","Silver","KK0-0212",2018,39000,owner2));
		};
	}
}
