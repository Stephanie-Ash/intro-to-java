package com.qa.animal.exercises;

public class Whale extends Animal {
	String size;
	String species;

	public Whale(String name, String bodyCovering, String appendages, String methodOfMovement, String size,
			String species) {
		super(name, bodyCovering, appendages, methodOfMovement);
		this.size = size;
		this.species = species;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public void describeVisually() {
		System.out.println("A Whale has " + getBodyCovering() + " on its body and " + getAppendages()
				+ " used for swimming. This particular Whale is a " + species + " and is " + size + " in size.");
	}
	
	@Override
	public void shouting() {
		System.out.println("Whales go click!");
	}

	public void swimming() {
		System.out.println("Whales are great swimmers but they can't stay under water for ever. They must come up for air occasionally.");
	}

	@Override
	public String toString() {
		return "Whale\n  Size: " + size + "\n  Species: " + species + "\n  Name: " + getName()
				+ "\n  Body Covering: " + getBodyCovering() + "\n  Appendages: " + getAppendages()
				+ "\n  Method Of Movement: " + getMethodOfMovement();
	}

}
