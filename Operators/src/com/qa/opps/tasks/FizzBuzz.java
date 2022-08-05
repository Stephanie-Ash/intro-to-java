package com.qa.opps.tasks;

public class FizzBuzz {
	public String fizzOrBuzz(int x) {
		if(x % 15 == 0) {
			return "FizzBuzz";
		} else if(x % 3 == 0) {
			return "Fizz";
		} else if(x % 5 == 0) {
			return "Buzz";
		} else {
			return String.valueOf(x);
		}
	}
}
