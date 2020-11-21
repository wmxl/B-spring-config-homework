package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest()
@TestPropertySource(properties = {"levelNumber=2"})
class DemoSpringConfigApplicationTests {

	@Autowired
	LevelController levelController;

	@Test
	void contextLoads() {
		assertEquals("advanced", levelController.getLevel());
	}

}
