package com.qa.animal.exercises;

public class Chicken extends Animal {
	String size;
	String plumageColour;

	public Chicken(String name, String bodyCovering, String appendages, String methodOfMovement, String size,
			String plumageColour) {
		super(name, bodyCovering, appendages, methodOfMovement);
		this.size = size;
		this.plumageColour = plumageColour;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPlumageColour() {
		return plumageColour;
	}

	public void setPlumageColour(String plumageColour) {
		this.plumageColour = plumageColour;
	}

	@Override
	public void describeVisually() {
		System.out.println("A Chicken has " + getBodyCovering() + " on its body and two small " + getAppendages()
				+ ". This particular Chicken is " + size + " in size with " + plumageColour + " plumage.");
	}
	
	@Override
	public void shouting() {
		System.out.println("Chickens go cluck!");
	}

	public void flying() {
		System.out.println("Despite having wings chickens cannot fly further than a few yards.");
	}

	@Override
	public String toString() {
		return "Chicken\n  Size: " + size + "\n  Plumage Colour: " + plumageColour + "\n  Name: " + getName()
				+ "\n  Body Covering: " + getBodyCovering() + "\n  Appendages: " + getAppendages()
				+ "\n  Method Of Movement: " + getMethodOfMovement();
	}

}
