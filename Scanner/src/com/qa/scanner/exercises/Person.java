package com.qa.scanner.exercises;

public class Person {
	private String name;
	private int age;
	private String jobTitle;
	
	public Person() {}

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	@Override
	public String toString() {
		return "Person\n  Name: " + name + "\n  Age: " + age + "\n  Job Title: " + jobTitle;
	}
	
}
