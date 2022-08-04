package com.qa.tcc.runner;

import com.qa.tcc.entity.Student;

public class Runner {

	public static void main(String[] args) {
		Student adam = new Student();
		Student stephanie = new Student("Stephanie", 19, "Earth Sciences");
		
		System.out.println(adam);
		System.out.println(stephanie);
		adam.welcome();
		stephanie.specificWelcome();
	}

}
