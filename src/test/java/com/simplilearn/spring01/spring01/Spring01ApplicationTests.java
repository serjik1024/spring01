package com.simplilearn.spring01.spring01;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

@SpringBootTest
class Spring01ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void simpleTest(){
		int a = 1;
		int b = 2;
		assertTrue(a + b == 3);
	}

}
