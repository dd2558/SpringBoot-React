package com.packet.cardatabase;

import com.packet.cardatabase.domain.Car;
import com.packet.cardatabase.domain.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(CardatabaseApplication.class);
	@Autowired
	private CarRepository carRepository;

	public static void main(String[] args) {

		SpringApplication.run(CardatabaseApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
		carRepository.save(new Car("Ford","Mustang","Red","ADF-1121",2021,59000));
		carRepository.save(new Car("Nissan","Leaf","White","SSJ-3002",2019,29000));
		carRepository.save(new Car("Toyota","Prius","Silver","KK0-0212",2020,39000));
		for(Car car : carRepository.findAll()) {
			log.info(car.getBrand() + " " + car.getModel());
		}
	}
}
