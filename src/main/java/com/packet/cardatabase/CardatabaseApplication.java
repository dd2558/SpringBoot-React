package com.packet.cardatabase;

import com.packet.cardatabase.domain.Car;
import com.packet.cardatabase.domain.CarRepository;
import com.packet.cardatabase.domain.Owner;
import com.packet.cardatabase.domain.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(CardatabaseApplication.class);
	@Autowired
	private CarRepository carRepository;

	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {

		SpringApplication.run(CardatabaseApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner("John","Johnson");
		Owner owner2 = new Owner("Mary","Robinson");
		ownerRepository.saveAll(Arrays.asList(owner1, owner2));

		carRepository.save(new Car("Ford","Mustang","Red","ADF-1121",2021,59000,owner1));
		carRepository.save(new Car("Nissan","Leaf","White","SSJ-3002",2019,29000,owner2));
		carRepository.save(new Car("Toyota","Prius","Silver","KK0-0212",2020,39000,owner2));
		for(Car car : carRepository.findAll()) {
			log.info(car.getBrand() + " " + car.getModel());
		}
	}
}
