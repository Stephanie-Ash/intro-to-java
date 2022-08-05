package com.qa.opps.tasks;

public class Calculator {

	public double add(double x, double y) {
		double result = x + y;
		return result;
	}
	
	public double multiply(double x, double y) {
		double result = x * y;
		return result;
	}
	
	public double subtract(double x, double y) {
		double result = x - y;
		return result;
	}
	
	public String divide(double x, double y) {
		if(x <= y) {
			double result = x / y;
			return String.valueOf(result);
		} else {
			return "The division cannot be performed";
		}
		
	}

}
