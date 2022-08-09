package com.qa.loops.tasks;

public class Flowcharts {
	public void chartOne() {
		for(int i = 100; i < 201; i++) {
			System.out.println(i);
		}
	}
	
	public void chartTwo() {
		for (int i = 100; i <= 200; i++) {
			if(i % 2 == 0) {
				System.out.println('-');
			} else {
				System.out.println('*');
			}
		}
	}
	
	public void printNumbers() {
		for(int i = 1; i < 11; i++) {
			for(int j = 1; j < 11; j++) {
				System.out.println(j);
			}
		}
	}
	
	public void printNumbers2() {
		for(int i = 1; i < 11; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.println(i);
			}
		}
	}

}
