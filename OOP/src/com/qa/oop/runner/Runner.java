package com.qa.oop.runner;

import com.qa.oop.tasks.Animal;
import com.qa.oop.tasks.Artist;
import com.qa.oop.tasks.Bicycle;
import com.qa.oop.tasks.Car;
import com.qa.oop.tasks.Developer;
import com.qa.oop.tasks.Sheep;
import com.qa.oop.tasks.Student;

public class Runner {

	public static void main(String[] args) {
//		Artist frida = new Artist("Frida Kahlo", 1920, false, "Surrealism", "The Two Fridas (1939)");
//		System.out.println(frida);
//		
//		System.out.println(frida.getBirthYear());
//		frida.setBirthYear(1907);
//		System.out.println(frida.getBirthYear());
//		
//		System.out.println(frida.calculateAge(1954));
//		
//		
//		Developer james = new Developer("James Hall", 40, "Software Development", "Java", "Backend");
//	
//		System.out.println(james);
//		james.greeting();
//		james.expelStudent(true);
//		
//		
//		System.out.println("=======Developer=======");
//		Developer ben = new Developer("Ben Smith", 41, "Software Development", "Python", "Backend");
//		ben.greeting();
//		ben.specialism();
//		System.out.println("=======Student=======");
//		Student benStudent = new Developer("Ben Smith", 41, "Software Development", "Python", "Backend");
//		benStudent.greeting();
//		((Developer)benStudent).specialism();
//		System.out.println("=======Object=======");
//		Object benObject = new Developer("Ben Smith", 41, "Software Development", "Python", "Backend");
//		((Developer)benObject).greeting();
//		((Developer)benObject).specialism();
		
//		Animal shaun = new Sheep();
//		shaun.sound();
//		shaun.food();
//		shaun.sleeping();
//		shaun.eating();
		
		Car renault = new Car();
		renault.describeGeneral();
		renault.describeObject();
		renault.accelerate();
		renault.brake();
		renault.changeGear();
		renault.hasWheels();
		
		Bicycle trek = new Bicycle();
		trek.describeGeneral();
		trek.describeObject();
		trek.accelerate();
		trek.brake();
		trek.changeGear();
		trek.hasWheels();
	}
}
