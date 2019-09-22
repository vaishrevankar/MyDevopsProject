package com.wipro.mul;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplyTest {

	@Test
	void test() {
		Mul_Num test = new Mul_Num();
		int result = test.multiply(5,6);
		assertEquals(30,result);
		
	}

}
