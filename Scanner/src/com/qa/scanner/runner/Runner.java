package com.qa.scanner.runner;

import java.util.ArrayList;
import java.util.List;

import com.qa.scanner.exercises.Calculator;
import com.qa.scanner.exercises.Person;
import com.qa.scanner.exercises.PersonUserOptions;

public class Runner {
	public static void main(String[] args) {
//		Calculator calc = new Calculator();
//		calc.calculate();
		
		Person stephanie = new Person("Stephanie", 21, "Junior Developer");
		Person james = new Person("James", 45, "Spy");
		Person elizabeth = new Person("Elizabeth", 96, "Queen");
		
		List<Person> listOfPeople = new ArrayList<>();
		listOfPeople.add(stephanie);
		listOfPeople.add(james);
		listOfPeople.add(elizabeth);
		
//		for(Person p : listOfPeople) {
//			System.out.println(p);
//		}
		
		PersonUserOptions userFunctions = new PersonUserOptions();
		
		userFunctions.manipulatePerson(listOfPeople);

	}

}
