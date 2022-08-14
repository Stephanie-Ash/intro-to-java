package com.qa.person.entity;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private int age;
	private String jobTitle;
	private List<Pet> pets = new ArrayList<>();
	
	public Person() {}
	
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public Person(String name, int age, String jobTitle, List<Pet> pets) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.pets = pets;
	}
	
	// adding a pet
	public void addPet(Pet pet) {
		this.pets.add(pet);
	}
	
	// alternative
	public void addPetDifferent(String name, String type, int age) {
		Pet pet = new Pet(name, type, age);
		this.pets.add(pet);
	}
	
	//removing a pet
	public void removePet(Pet pet) {
		this.pets.remove(pet);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		return "Person\n  Name: " + name + "\n  Age: " + age + "\n  Job Title: " + jobTitle + "\n  Pets: \n    " + pets;
	}

}
