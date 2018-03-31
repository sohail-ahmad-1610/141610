package com.app.myCalculator;

public class CalculatorMain {

	public static void main(String[] args) {
	
		System.out.println("5 * 5 = " + new SimpleCalculator().MultiplyNumbers(5, 5));
		System.out.println("5 + 5 = " + new SimpleCalculator().AddNumbers(5, 5));
		System.out.println("5 - 5 = " + new SimpleCalculator().SubtractNumbers(5, 5));
		System.out.println("5 / 5 = " + new SimpleCalculator().DivideNumbers(5, 5));
	}
}
