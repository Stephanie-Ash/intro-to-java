package com.qa.opps.runner;

import com.qa.opps.tasks.Blackjack;
import com.qa.opps.tasks.Calculator;
import com.qa.opps.tasks.FizzBuzz;
import com.qa.opps.tasks.Results;
import com.qa.opps.tasks.UniqueSum;

public class Runner {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(5.5, 4.2));
		System.out.println(calc.multiply(10, 2));
		System.out.println(calc.subtract(100, 50));
		System.out.println(calc.divide(34, 20));
		
		Results res = new Results(89, 89, 89);
		res.displayResults();
		res.physics();
		res.chemistry();
		res.biology();
		res.calculatePercentage();
		
		Blackjack black = new Blackjack();
		System.out.println(black.winningScore(5, 12));
		
		FizzBuzz fizz = new FizzBuzz();
		System.out.println(fizz.fizzOrBuzz(30));
		
		UniqueSum sum = new UniqueSum();
		System.out.println(sum.sum(2, 2, 1));
	}

}
