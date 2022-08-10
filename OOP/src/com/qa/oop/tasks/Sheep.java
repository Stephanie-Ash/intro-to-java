package com.qa.oop.tasks;

public class Sheep extends Animal {
	@Override
	public void sound() {
		System.out.println("A sheep goes baaaa!");
	}
	
	@Override
	public void food() {
		System.out.println("A sheep eats grass.");
	}
	
	@Override
	public void sleeping() {
		System.out.println("The sheep is asleep Zzzzzz!");
	}
	
	@Override
	public void eating() {
		System.out.println("The sheep is eating crunch crunch!");
	}

}
