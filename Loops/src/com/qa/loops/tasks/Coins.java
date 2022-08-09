package com.qa.loops.tasks;

public class Coins {
	
	public void calculateChange(float cost, float amount) {
		float change = amount*100 - cost*100;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int fiftyP = 0;
		int twentyP = 0;
		int tenP = 0;
		int fiveP = 0;
		int twoP = 0;
		int oneP = 0;
		
		while(change >= 2000) {
			twenties += 1;
			change -= 2000;
		}
		
		while(change >= 1000) {
			tens += 1;
			change -= 1000;
		}
		
		while(change >= 500) {
			fives += 1;
			change -= 500;
		}
		
		while(change >= 100) {
			ones += 1;
			change -= 100;
		}
		
		while(change >= 50) {
			fiftyP += 1;
			change -= 50;
		}
		
		while(change >= 20) {
			twentyP += 1;
			change -= 20;
		}
		
		while(change >= 10) {
			tenP += 1;
			change -= 10;
		}
		
		while(change >= 5) {
			fiveP += 1;
			change -= 5;
		}
		
		while(change >= 2) {
			twoP += 1;
			change -= 2;
		}
		
		while(change >= 1) {
			oneP += 1;
			change -= 1;
		}
		
		System.out.println("Your Change contains:");
		System.out.println("Twenty pound notes: " + twenties);
		System.out.println("Ten pound notes: " + tens);
		System.out.println("Five pound notes: " + fives);
		System.out.println("Pound couns: " + ones);
		System.out.println("Fifty pence pieces: " + fiftyP);
		System.out.println("Twenty pence pieces: " + twentyP);
		System.out.println("Ten pence pieces: " + tenP);
		System.out.println("Five pence pieces: " + fiveP);
		System.out.println("Two pence pieces: " + twoP);
		System.out.println("One pence pieces: " + oneP);
	}

}
