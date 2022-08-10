package com.qa.oop.tasks;

public class Student {
	private String name;
	private int age;
	private String subject;
	
	public Student() {};
	
	public Student(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void greeting() {
		System.out.println("Welcome " + name + " I hope you enjoy studying " + subject + "!");
	}
	
	public static void expelStudent(boolean status) {
		if(status) {
			System.out.println("Dear student, your work has not been good enough and you have been expelled.");
		} else {
			System.out.println("Dear student, your work is great and you can continue studying.");
		}
	}

	@Override
	public String toString() {
		return "Student:\n  Name: " + name + "\n  Age: " + age + "\n  Subject: " + subject;
	}
	
}
