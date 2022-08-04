package com.qa.tcc.entity;

public class Student {
	private String name;
	private int age;
	private String degree;
	
	// Default Constructor
	public Student() {
		
	}
	
	// Everything Constructor
	public Student(String name, int age, String degree) {
		this.name = name;
		this.age = age;
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", degree=" + degree + "]";
	}
	
	public void welcome() {
		System.out.println("Welcome to the university!");
	}
	
	public void specificWelcome() {
		System.out.println("Hello " + name + " welcome. You will be studying " + degree + ".");
	}

}
