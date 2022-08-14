package com.qa.animal.exercises;

public class Sheep extends Animal {
	String woolColour;
	String faceColour;
	boolean hasHorns;

	public Sheep(String name, String bodyCovering, String appendages, String methodOfMovement, String woolColour,
			String faceColour, boolean hasHorns) {
		super(name, bodyCovering, appendages, methodOfMovement);
		this.woolColour = woolColour;
		this.faceColour = faceColour;
		this.hasHorns = hasHorns;
	}

	public String getWoolColour() {
		return woolColour;
	}

	public void setWoolColour(String woolColour) {
		this.woolColour = woolColour;
	}

	public String getFaceColour() {
		return faceColour;
	}

	public void setFaceColour(String faceColour) {
		this.faceColour = faceColour;
	}

	public boolean isHasHorns() {
		return hasHorns;
	}

	public void setHasHorns(boolean hasHorns) {
		this.hasHorns = hasHorns;
	}

	@Override
	public void describeVisually() {
		System.out.println("A sheep has " + getBodyCovering() + " on its body and " + getAppendages()
				+ ". This particular sheep has " + woolColour + " wool and a " + faceColour + " face.");
	}
	
	@Override
	public void shouting() {
		System.out.println("Sheep go baaaaaaa!");
	}
	
	public void watchOut() {
		if(hasHorns) {
			System.out.println("Danger this animal has horns stay away from the head.");
		} else {
			System.out.println("No horns on this sheep, give the head a stroke!");
		}
	}

	@Override
	public String toString() {
		return "Sheep\n  Wool Colour: " + woolColour + "\n  Face Colour: " + faceColour + "\n  Has Horns: " + hasHorns
				+ "\n  Name: " + getName() + "\n  Body Covering: " + getBodyCovering() + "\n  Appendages: "
				+ getAppendages() + "\n  Method Of Movement: " + getMethodOfMovement();
	}

}
