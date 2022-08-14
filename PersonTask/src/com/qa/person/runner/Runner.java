package com.qa.person.runner;

import com.qa.person.entity.Person;
import com.qa.person.entity.Pet;
import com.qa.person.handler.PersonHandler;


public class Runner {

	public static void main(String[] args) {
		PersonHandler handler = new PersonHandler();
		
		Person stephanie = new Person("Stephanie", 21, "Junior Developer");
		Person james = new Person("James", 45, "Spy");
		Person elizabeth = new Person("Elizabeth", 96, "Queen");
		Person charles = new Person("Charles", 73, "Prince");
		
		Pet maurice = new Pet("Maurice", "cat", 12);
		Pet phillip = new Pet("Phillip", "corgi", 5);
		Pet sheepy = new Pet("Sheepy", "sheep", 36);
		
		handler.addPerson(stephanie);
		handler.addPerson(james);
		handler.addPerson(elizabeth);
		handler.addPerson(charles);
		
		stephanie.addPet(sheepy);
		stephanie.addPet(maurice);
		elizabeth.addPet(phillip);
		
		
		handler.print();

	}

}
