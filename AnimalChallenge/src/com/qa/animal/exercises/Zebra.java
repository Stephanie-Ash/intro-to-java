package com.qa.animal.exercises;

public class Zebra extends Animal {
	String size;
	String livingLocation;

	public Zebra(String name, String bodyCovering, String appendages, String methodOfMovement, String size,
			String livingLocation) {
		super(name, bodyCovering, appendages, methodOfMovement);
		this.size = size;
		this.livingLocation = livingLocation;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getLivingLocation() {
		return livingLocation;
	}

	public void setLivingLocation(String livingLocation) {
		this.livingLocation = livingLocation;
	}

	@Override
	public void describeVisually() {
		System.out.println("A Zebra has stripy " + getBodyCovering() + " on its body and " + getAppendages()
				+ ". This particular Zebra is " + size + " in size.");
	}
	
	@Override
	public void shouting() {
		System.out.println("Zebras go bray!");
	}

	public void living() {
		System.out.println("This type of Zebra lives in " + livingLocation + ".");
	}

	@Override
	public String toString() {
		return "Zebra\n  Size: " + size + "\n  Living Location: " + livingLocation + "\n  Name: " + getName()
				+ "\n  Body Covering: " + getBodyCovering() + "\n  Appendages: " + getAppendages()
				+ "\n  Method Of Movement: " + getMethodOfMovement();
	}

}
