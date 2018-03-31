package com.app.myCalculator;

public class SimpleCalculator {

	// Default Constructor......
	public SimpleCalculator(){}
	
	public int MultiplyNumbers(int x , int y){
		
		if (x > 999){
			
			throw new IllegalArgumentException();
		}
		
		return x * y ;
	}
	
	public int AddNumbers(int x , int y){
		
		if (x > 999){
			
			throw new IllegalArgumentException();
		}
		
		return x + y ;
	}
	
	public int SubtractNumbers(int x , int y){
		
		if (x > 999){
			
			throw new IllegalArgumentException();
		}
		
		if (x >= y){
			return x - y ;
		}
		
		return y - x ;
	}

	public int DivideNumbers(int x , int y){
	
	if (x > 999){
		
		throw new IllegalArgumentException();
	}
	
	if (y <= 0){
		
		throw new ArithmeticException();
	}
	
	return x / y ;
	}
}
