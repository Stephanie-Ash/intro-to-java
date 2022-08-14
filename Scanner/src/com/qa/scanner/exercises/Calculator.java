package com.qa.scanner.exercises;

import java.util.Scanner;

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
		if (y != 0) {
			double result = x / y;
			return String.valueOf(result);
		} else {
			return "Error cannot divide by zero!";
		}

	}

	public void calculate() {
		Scanner scan = new Scanner(System.in);

		System.out.println(
				"Which calculation would you like to perform?\n  a. Addition\n  b. Subtraction\n  c. Multiplication\n  d. Division\nEnter a, b, c, or d into the console:");
		String choice = scan.nextLine();
		System.out.println("Please enter the first number for use in the calculation:");
		Double valueOne = scan.nextDouble();
		System.out.println("Please enter the second number for use in the calculation:");
		Double valueTwo = scan.nextDouble();
		
		if(choice.equals("a")) {
			double result = add(valueOne, valueTwo);
			System.out.println(valueOne + " plus " + valueTwo + " equals " + result);
		} else if (choice.equals("b")) {
			double result = subtract(valueOne, valueTwo);
			System.out.println(valueOne + " minus " + valueTwo + " equals " + result);
		} else if (choice.equals("c")) {
			double result = multiply(valueOne, valueTwo);
			System.out.println(valueOne + " multiplied by " + valueTwo + " equals " + result);
		} else if (choice.equals("d")) {
			String result = divide(valueOne, valueTwo);
			System.out.println(valueOne + " divided by " + valueTwo + " equals " + result);
		} else {
			System.out.println("I'm sorry you did not enter a correct calculation method!");
		}
		
		scan.close();
	}

}
