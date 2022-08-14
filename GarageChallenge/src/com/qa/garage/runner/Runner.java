package com.qa.garage.runner;

import com.qa.garage.entity.Car;
import com.qa.garage.entity.Motorbike;
import com.qa.garage.entity.Van;
import com.qa.garage.entity.Vehicle;
import com.qa.garage.handler.Garage;

public class Runner {
	public static void main(String[] args) {
		Garage garage = new Garage();
		
		Vehicle carOne = new Car(1, 4, "Red", "renault", "hatchback", false);
		Vehicle motorbikeOne = new Motorbike(1, 2, "Blue", "Harley", true);
		Vehicle vanOne = new Van(3, 4, "White", "Ford", true, 40);
		
		garage.addVehicle(carOne);
		garage.addVehicle(motorbikeOne);
		garage.addVehicle(vanOne);
		
		garage.fixVehicle();
	}

}
