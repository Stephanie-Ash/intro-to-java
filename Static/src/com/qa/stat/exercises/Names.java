package com.qa.stat.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Names {
	
	public static List<String> names = new ArrayList<>();
	
	public static String name = storeNames();
	
	static {
		names.add(name);
	}
	
	public static String storeNames() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = scan.nextLine();
		scan.close();
		
		return name;
		
	}

}
