package com.qa.garage.entity;

public class Motorbike extends Vehicle {
	private boolean hasSidecar;

	public Motorbike(int id, int numOfWheels, String colour, String make, boolean hasSidecar) {
		super(id, numOfWheels, colour, make);
		this.hasSidecar = hasSidecar;
	}

	public boolean isHasSidecar() {
		return hasSidecar;
	}

	public void setHasSidecar(boolean hasSidecar) {
		this.hasSidecar = hasSidecar;
	}

	@Override
	public String toString() {
		return "Motorbike [hasSidecar=" + hasSidecar + ", getNumOfWheels()=" + getNumOfWheels() + ", getColour()="
				+ getColour() + ", getMake()=" + getMake() + "]";
	}

}
