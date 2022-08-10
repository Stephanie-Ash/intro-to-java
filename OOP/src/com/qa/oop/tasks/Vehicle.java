package com.qa.oop.tasks;

public abstract class Vehicle implements Describer, GearChange {
	public abstract void accelerate();
	public abstract void brake();
	
	@Override
	public abstract void changeGear();
	
	@Override
	public abstract void describeObject();
		
	public void describeGeneral() {
		System.out.println("This is an example of a vehicle.");
	}

}
