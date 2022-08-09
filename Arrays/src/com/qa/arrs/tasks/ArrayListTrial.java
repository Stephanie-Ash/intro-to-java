package com.qa.arrs.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTrial {
	public void createArrayList() {
		List<String> food = new ArrayList<>();
		food.add("crisps");
		food.add("jelly sweets");
		food.add("chocolate");
		food.add("chips");
		
		System.out.println(food);
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		for(String i : food) {
			System.out.println(i);
		}
		
		System.out.println(food.get(0));
		System.out.println(food.get(2));
		
		food.set(3, "fruit");
		System.out.println(food.get(3));
		
		food.remove(3);
		Collections.sort(food);
		System.out.println(food);
		Collections.reverse(food);
		System.out.println(food);
		Collections.swap(food, 0, 2);
		System.out.println(food);
		food.clear();
		System.out.println(food);
	}

}
