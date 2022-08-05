package com.qa.opps.tasks;

public class Blackjack {
	public String winningScore(int x, int y) {
		
		if(x > 21 && y > 21) {
			return "Both players are bust!";
		} else if(x == y) {
			return "It's a draw!";
		} else if((x <= 21 && x > y) || y > 21) {
			return "Hand one wins with a score of " + String.valueOf(x);
		} else {
			return "Hand two wins with a score of " + String.valueOf(y);
		}
	}
}
