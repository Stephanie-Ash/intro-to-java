package com.qa.animal.exercises;

public abstract class Animal implements Sleep, Sound {
	private String name;
	private String bodyCovering;
	private String appendages;
	private String methodOfMovement;

	public Animal(String name, String bodyCovering, String appendages, String methodOfMovement) {
		this.name = name;
		this.bodyCovering = bodyCovering;
		this.appendages = appendages;
		this.methodOfMovement = methodOfMovement;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBodyCovering() {
		return bodyCovering;
	}

	public void setBodyCovering(String bodyCovering) {
		this.bodyCovering = bodyCovering;
	}

	public String getAppendages() {
		return appendages;
	}

	public void setAppendages(String appendages) {
		this.appendages = appendages;
	}

	public String getMethodOfMovement() {
		return methodOfMovement;
	}

	public void setMethodOfMovement(String methodOfMovement) {
		this.methodOfMovement = methodOfMovement;
	}
	
	public abstract void describeVisually();

	public void describeMovement() {
		System.out.println("This animal has " + appendages + " and uses " + methodOfMovement + " to get around.");
	}

	public void description() {
		System.out.println(
				"Animals can be classified according to different characteristics such as:\nBody covering, appendages and method of movement.");
	}
	
	@Override
	public void sleeping() {
		System.out.println("Shhhh the animal is asleep Zzzzzzz!");
	}

}
