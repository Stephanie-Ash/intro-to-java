package com.qa.garage.entity;

public abstract class Vehicle {
	private int id;
	private int numOfWheels;
	private String colour;
	private String make;
	
	public Vehicle(int id, int numOfWheels, String colour, String make) {
		this.id = id;
		this.numOfWheels = numOfWheels;
		this.colour = colour;
		this.make = make;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	

}
