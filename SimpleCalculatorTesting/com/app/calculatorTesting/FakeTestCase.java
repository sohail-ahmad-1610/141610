package com.app.calculatorTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.myCalculator.SimpleCalculator;

public class FakeTestCase {

	@Test
	public void testFake() {
		
		//SimpleCalculator calcul = new SimpleCalculator();
		
		assertEquals("5 + 5 should be 10" , 11 , new SimpleCalculator().AddNumbers(5, 5));
		//fail("Not yet implemented");
	}
}
