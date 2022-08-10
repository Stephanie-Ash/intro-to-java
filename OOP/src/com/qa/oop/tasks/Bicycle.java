package com.qa.oop.tasks;

public class Bicycle extends Vehicle implements Wheels {
	@Override
	public void changeGear() {
		System.out.println("Use the handlebar gears to change gears.");	
	}

	@Override
	public void accelerate() {
		System.out.println("Pedal faster to accelerate.");
		
	}

	@Override
	public void brake() {
		System.out.println("Use the handlebar brakes to brake.");
		
	}

	@Override
	public void hasWheels() {
		System.out.println("This vehicle has wheels.");
		
	}

	@Override
	public void describeObject() {
		System.out.println("This is an example of a bicycle.");
		
	}

}
