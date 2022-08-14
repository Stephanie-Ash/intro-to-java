package com.qa.garage.handler;

import java.util.ArrayList;
import java.util.List;

import com.qa.garage.entity.Car;
import com.qa.garage.entity.Motorbike;
import com.qa.garage.entity.Van;
import com.qa.garage.entity.Vehicle;

public class Garage {
	
	List<Vehicle> vehicles = new ArrayList<>();

	public Garage() {}

	public Garage(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	// add vehicle
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	
	// remove vehicle by id
	public void addVehicleById(int id) {
		for(Vehicle v : vehicles) {
			if(v.getId() == id) {
				removeVehicle(v);
			}
		}
		
	}
	
	// remove vehicle
	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}
	
	// calculate bill
	public void fixVehicle() {
		int totalBill = 0;
		for(Vehicle v : vehicles) {
			if(v instanceof Car) {
				totalBill += v.getNumOfWheels() * 6;
			} else if(v instanceof Van) {
				totalBill += v.getNumOfWheels() + ((Van)v).getStorageSize() * 8;
			} else if(v instanceof Motorbike) {
				totalBill += v.getNumOfWheels() * 4;
			}
		}
		System.out.println("The total bill for the garage is " + totalBill);
	}
	
	public void emptyGarage() {
		this.vehicles.clear();
		System.out.println("All vehicles deleted!");
	}


}
