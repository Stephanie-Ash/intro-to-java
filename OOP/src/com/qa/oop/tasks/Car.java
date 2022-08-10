package com.qa.oop.tasks;

public class Car extends Vehicle implements Wheels {

	@Override
	public void changeGear() {
		System.out.println("Use the gear stick to change gears.");	
	}

	@Override
	public void accelerate() {
		System.out.println("Use the accelerator pedal to accelerate.");
		
	}

	@Override
	public void brake() {
		System.out.println("Use the brake pedal to brake.");
		
	}

	@Override
	public void hasWheels() {
		System.out.println("This vehicle has wheels.");
		
	}

	@Override
	public void describeObject() {
		System.out.println("This is an example of a car.");
		
	}
	

}
