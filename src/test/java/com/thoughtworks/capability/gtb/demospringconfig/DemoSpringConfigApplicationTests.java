package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = { "levelNumber=0" })
class DemoSpringConfigApplicationTests {

	@Autowired
	LevelController levelController;

	@Test
	void contextLoads() {
		Assertions.assertEquals("basic", levelController.getLevel());
	}

}