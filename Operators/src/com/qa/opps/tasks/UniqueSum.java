package com.qa.opps.tasks;

public class UniqueSum {
	public int sum(int x, int y, int z) {
		if(x == y && y == z) {
			return 0;
		} else if(x == y) {
			return z;
		} else if(x == z) {
			return y;
		} else if(y == z) {
			return x;
		} else {
			return x + y + z;
		}
	}
}
