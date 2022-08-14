package com.qa.scanner.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonUserOptions {
	public void printAllPeople(List<Person> listOfPeople) {
		for(Person p : listOfPeople) {
			System.out.println(p);
		}
	}
	
	public void searchForPerson(List<Person> listOfPeople, String name) {
		for(Person p : listOfPeople) {
			if(p.getName().equals(name)) {
				System.out.println("Please see below the details of the person you searched for.");
				System.out.println(p);
			} 
		}
	}
	
	public void manipulatePerson(List<Person> listOfPeople) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome! Select from one of the following options:\n  a. Create Person\n  b. Output details for all people\n  c. Search for a person Enter a, b or c: ");
		String choice = scan.nextLine();
		
		if(choice.equals("b")) {
			printAllPeople(listOfPeople);
		} else if(choice.equals("c"))  {
			System.out.println("Enter a name: ");
			String name = scan.nextLine();
			searchForPerson(listOfPeople, name);
		} else if(choice.equals("a")) {
			System.out.println("Enter the persons name: ");
			String name = scan.nextLine();
			System.out.println("Enter the persons age: ");
			int age = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the persons job title: ");
			String jobTitle = scan.nextLine();
			Person newPerson = new Person(name, age, jobTitle);
			System.out.println("The person has been created, see the details below.");
			System.out.println(newPerson);
		}
		
		scan.close();
	}

}
