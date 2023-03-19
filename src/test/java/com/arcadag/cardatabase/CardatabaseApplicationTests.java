package com.arcadag.cardatabase;

import com.arcadag.cardatabase.web.CarController;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CardatabaseApplicationTests {
	@Autowired
	private CarController carController;

	@Test
	@DisplayName("First example test cast")
	void contextLoads() {
		assertThat(carController).isNotNull();
	}

}
