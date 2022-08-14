package com.qa.person.handler;

import java.util.ArrayList;
import java.util.List;

import com.qa.person.entity.Person;

public class PersonHandler {
	
	List<Person> people = new ArrayList<>();
	
	public PersonHandler() {}
	
	public PersonHandler(List<Person> people) {
		this.people = people;
	}
	
	// add person
	public void addPerson(Person person) {
		this.people.add(person);
	}
	
	// remove person
	public void removePerson(Person person) {
		this.people.remove(person);
	}
	
	// find by name
	public Person findByName(String name) {
		for(Person p : people) {
			if(p.getName().equalsIgnoreCase(name)) {
				return p;
			}
		}
		System.out.println("There is noone with the name " + name + " int the list");
		return null;
	}
	
	//print all
	public void print() {
		for(Person p : people) {
			System.out.println(p);
		}
	}

}
