package jbr.gradle.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calc = new Calculator();
		Assertions.assertEquals(9, calc.add(4, 5));
	}

	@Test
	void testSub() {
		Calculator calc = new Calculator();
		Assertions.assertEquals(1, calc.sub(5, 4));
	}

	@Test
	void testMul() {
		Calculator calc = new Calculator();
		Assertions.assertEquals(20, calc.mul(5, 4));
	}
	
	@Test
	void testDiv() {
		Calculator calc = new Calculator();
		Assertions.assertEquals(5, calc.div(15, 3));
	}
}
