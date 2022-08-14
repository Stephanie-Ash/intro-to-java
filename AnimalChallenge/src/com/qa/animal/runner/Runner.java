package com.qa.animal.runner;

import com.qa.animal.exercises.Sheep;

public class Runner {
	public static void main(String[] args) {
		Sheep sheepy = new Sheep("Sheepy", "wool", "legs", "walking", "white", "black", true);
		
		sheepy.describeVisually();
		sheepy.describeMovement();
		sheepy.description();
		sheepy.shouting();
		sheepy.sleeping();
		sheepy.watchOut();
		System.out.println(sheepy);
	}

}
