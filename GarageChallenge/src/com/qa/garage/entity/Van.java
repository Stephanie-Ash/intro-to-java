package com.qa.garage.entity;

public class Van extends Vehicle {
	private boolean hasLift;
	private int storageSize;
	
	public Van(int id, int numOfWheels, String colour, String make, boolean hasLift, int storageSize) {
		super(id, numOfWheels, colour, make);
		this.hasLift = hasLift;
		this.storageSize = storageSize;
	}

	public boolean isHasLift() {
		return hasLift;
	}

	public void setHasLift(boolean hasLift) {
		this.hasLift = hasLift;
	}

	public int getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}

	@Override
	public String toString() {
		return "Van [hasLift=" + hasLift + ", storageSize=" + storageSize + ", getNumOfWheels()=" + getNumOfWheels()
				+ ", getColour()=" + getColour() + ", getMake()=" + getMake() + "]";
	}

}
