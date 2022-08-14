package com.qa.stat.exercises;

public class Inventory {
	private String itemID;
	private String itemName;
	private int quantity;
	private String description;
	
	public static int uniqueItems = 0;
	
	public Inventory() {
		uniqueItems++;
	}

	public Inventory(String itemID, String itemName, int quantity, String description) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.quantity = quantity;
		this.description = description;
		uniqueItems++;
	}
	
	public static void inventoryManagement(int num) {
		Inventory.uniqueItems = num;
	}

}
