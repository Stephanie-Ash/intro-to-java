package com.qa.oop.tasks;

public class Artist {
	// Attributes
	private String name;
	private int birthYear;
	private boolean active;
	private String style;
	private String famousWork;
	
	// Default constructor
	public Artist() {}
	
	// Everything constructor
	public Artist(String name, int birthYear, boolean active, String style, String famousWork) {
		this.name = name;
		this.birthYear = birthYear;
		this.active = active;
		this.style = style;
		this.famousWork = famousWork;
	}
	
	// Getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public boolean getActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public String getStyle() {
		return style;
	}
	
	public void setStyle(String style) {
		this.style = style;
	}
	
	public String getFamousWork() {
		return famousWork;
	}
	
	public void setFamousWork(String famousWork) {
		this.famousWork = famousWork;
	}
	
	// Other methods
	public int calculateAge(int year) {
		return year - birthYear;
	}
	
	public String isActive() {
		if (active) {
			return "Yes";
		} else {
			return "No";
		}
	}
	
	// To string
	@Override
	public String toString() {
		return "Artist\n  Name: " + name + "\n  Year of Birth: " + birthYear + "\n  Style of Art: " + style
				+ "\n  Famous Work: " + famousWork + "\n  Currently Active: " + isActive();
	}

}
