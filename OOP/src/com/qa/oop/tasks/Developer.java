package com.qa.oop.tasks;

public class Developer extends Student {
	private String language;
	private String frontOrBack;

	public Developer(String name, int age, String subject, String language, String frontOrBack) {
		super(name, age, subject);
		this.language = language;
		this.frontOrBack = frontOrBack;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getFrontOrBack() {
		return frontOrBack;
	}

	public void setFrontOrBack(String frontOrBack) {
		this.frontOrBack = frontOrBack;
	}
	
	@Override
	public void greeting() {
		System.out.println("Welcome " + getName() + " I hope you enjoy studying " + language + "!");
	}
	
	public void specialism() {
		System.out.println("Hello " + getName() + ". You have chosen " + frontOrBack + ".");
	}

	@Override
	public String toString() {
		return "Developer:\n  Name: " + getName() + "\n  Age: " + getAge() + "\n  Language: " + language
				+ "\n  Specialism: " + frontOrBack;
	}

}
