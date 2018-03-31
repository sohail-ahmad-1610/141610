package com.app.calculatorTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import com.app.myCalculator.SimpleCalculator;

public class SimpleCalculatorTestCase {

	@Test(expected = IllegalArgumentException.class)
	public void TestException(){
		
		new SimpleCalculator().MultiplyNumbers(1000, 1);
	}
	@Test(expected = IllegalArgumentException.class)
	public void TestException1(){
		
		new SimpleCalculator().AddNumbers(1000, 1);
	}
	@Test(expected = IllegalArgumentException.class)
	public void TestException2(){
		
		new SimpleCalculator().SubtractNumbers(1000, 1);
	}
	@Test(expected = IllegalArgumentException.class)
	public void TestException3(){
		
		new SimpleCalculator().DivideNumbers(1000, 1);
	}
	@Test(expected = ArithmeticException.class)
	public void TestException4(){
		
		new SimpleCalculator().DivideNumbers(10, 0);
	}
	@Test
	public void testMultiply() {
		
		//SimpleCalculator calcul = new SimpleCalculator();
		
		assertEquals("5 * 5 should be 25" , 25 , new SimpleCalculator().MultiplyNumbers(5, 5));
		//fail("Not yet implemented");
	}
	@Test
	public void testMultiply1() {
		
		//SimpleCalculator calcul = new SimpleCalculator();
		
		assertEquals("6 * 5 should be 30" , 30 , new SimpleCalculator().MultiplyNumbers(6, 5));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testAdd1() {
		
		//SimpleCalculator calcul = new SimpleCalculator();
		
		assertEquals("5 + 5 should be 10" , 10 , new SimpleCalculator().AddNumbers(5, 5));
		//fail("Not yet implemented");
	}
	@Test
	public void testAdd2() {
		
		//SimpleCalculator calcul = new SimpleCalculator();
		
		assertEquals("6 + 5 should be 10" , 11 , new SimpleCalculator().AddNumbers(6, 5));
		//fail("Not yet implemented");
	}
	@Test
	public void testAdd3() {
		
		//SimpleCalculator calcul = new SimpleCalculator();
		
		assertEquals("-1 + -1 should be -2" , -2 , new SimpleCalculator().AddNumbers(-1, -1));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testSubtract1() {
		
		//SimpleCalculator calcul = new SimpleCalculator();
		
		assertEquals("5 - 5 should be 0" , 0 , new SimpleCalculator().SubtractNumbers(5, 5));
		//fail("Not yet implemented");
	}
	@Test
	public void testSubtract2() {
		
		//SimpleCalculator calcul = new SimpleCalculator();
		
		assertEquals("6 - 5 should be 1" , 1 , new SimpleCalculator().SubtractNumbers(6, 5));
		//fail("Not yet implemented");
	}
	@Test
	public void testSubtract3() {
		
		//SimpleCalculator calcul = new SimpleCalculator();
		
		assertEquals("5 - 6 should be 1" , 1 , new SimpleCalculator().SubtractNumbers(5, 6));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testDivide() {
		
		//SimpleCalculator calcul = new SimpleCalculator();
		
		assertEquals("5 / 5 should be 1" , 1 , new SimpleCalculator().DivideNumbers(5, 5));
		//fail("Not yet implemented");
	}

}
