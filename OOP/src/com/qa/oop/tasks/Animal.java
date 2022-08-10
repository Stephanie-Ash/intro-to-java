package com.qa.oop.tasks;

public abstract class Animal {
	public abstract void sound();
	public abstract void food();
	
	public void sleeping() {
		System.out.println("The animal is asleep Zzzzzz!");
	}
	
	public void eating() {
		System.out.println("The animal is eating crunch crunch!");
	}

}
