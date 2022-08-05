package com.qa.opps.tasks;

public class Results {
	private int physics;
	private int chemistry;
	private int biology;
	private double total;
	private double percentage;
	private int failed;
	
	public Results(int physics, int chemistry, int biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
	}
	
	public void displayResults() {
		total = physics + chemistry + biology;
		
		System.out.println("Your Physics mark is " + physics + ",");
		System.out.println("Your Chemistry mark is " + chemistry + ",");
		System.out.println("Your Biology mark is " + biology + ",");
		System.out.println("Your total mark is " + total + " out of 450.0");
	}
	
	public void physics() {
		if (physics < 90) {
			failed++;
			System.out.println("You have failed physics!");
		}	
	}
	
	public void chemistry() {
		if (chemistry < 90) {
			failed++;
			System.out.println("You have failed chemistry!");
		}	
	}
	
	public void biology() {
		if (biology < 90) {
			failed++;
			System.out.println("You have failed biology!");
		}	
	}
	
	public void calculatePercentage() {
		percentage = total * 100 / 450;
		
		if (percentage < 60) {
			System.out.println("The total exam pass mark is 60%");
			System.out.println("Your total exam score is " + percentage + "% therefore you have failed");
		} else if(failed > 0) {
			System.out.println("You have failed " + failed + " subjects so have failed");
		} else {
			System.out.println("Congratulations you have passed your exams!");
		}
	}

}
