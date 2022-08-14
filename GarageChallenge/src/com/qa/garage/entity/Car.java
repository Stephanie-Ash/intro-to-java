package com.qa.garage.entity;

public class Car extends Vehicle {
	private String styleBoot;
	boolean hasSunroof;
	public Car(int id, int numOfWheels, String colour, String make, String styleBoot, boolean hasSunroof) {
		super(id, numOfWheels, colour, make);
		this.styleBoot = styleBoot;
		this.hasSunroof = hasSunroof;
	}
	
	public String getStyleBoot() {
		return styleBoot;
	}
	public void setStyleBoot(String styleBoot) {
		this.styleBoot = styleBoot;
	}
	public boolean isHasSunroof() {
		return hasSunroof;
	}
	public void setHasSunroof(boolean hasSunroof) {
		this.hasSunroof = hasSunroof;
	}

	@Override
	public String toString() {
		return "Car\n  ID: " + getId() + "\n  Boot Type: " + styleBoot + "\n  Has Sunroof: " + hasSunroof + "\n  Number of Wheels: " + getNumOfWheels()
				+ "\n  Colour: " + getColour() + "\n  Make: " + getMake();
	}
	
	

}
