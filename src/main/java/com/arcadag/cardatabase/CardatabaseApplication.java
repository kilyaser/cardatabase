package com.arcadag.cardatabase;

import com.arcadag.cardatabase.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	@Autowired
	private CarRepository carRepository;
	@Autowired
	private OwnerRepository ownerRepository;
	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		// some comment
		SpringApplication.run(CardatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner("John", "Johnson");
		Owner owner2 = new Owner("Mary", "Robinson");
		ownerRepository.saveAll(Arrays.asList(owner1, owner2));
		carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 5900, owner1));
		carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2019, 2900, owner2));
		carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 3900, owner2));

		for (Car car : carRepository.findAll()) {
			logger.info(car.getBrand() + " " + car.getModel());
		}

		userRepository.save(new User("user", "$2y$10$afZVtdofONMMrG//PN3Mxu6pBSBtWghA.WIBmV3bY6X6B/I7Goh8q", "USER"));
		userRepository.save(new User("admin", "$2y$10$N0OkyWi31F2YDx/xtSGxF.2nQKJW9GQhURE0stn/qCjBdt7wGu7bq", "ADMIN"));
	}
}
