package com.arcadag.cardatabase;

import com.arcadag.cardatabase.domain.Car;
import com.arcadag.cardatabase.domain.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	@Autowired
	private CarRepository repository;
	public static void main(String[] args) {
		// some comment
		SpringApplication.run(CardatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 5900));
		repository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2019, 2900));
		repository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 3900));

		for (Car car : repository.findAll()) {
			logger.info(car.getBrand() + " " + car.getModel());
		}
	}
}
