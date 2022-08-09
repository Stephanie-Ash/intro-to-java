package com.qa.arrs.tasks;

public class ArrayTrials {
	public void createArray() {
		int[] indexArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i = 0; i < indexArray.length; i++) {
			System.out.println(indexArray[i]);
		}
	}
	
	public void createAltArray() {
		int[] alternativeArray = new int[10];
		
		for(int i = 0; i < alternativeArray.length; i++) {
			alternativeArray[i] = i + 1;
			System.out.println(alternativeArray[i]);
		}
		
		for(int i = 0; i < alternativeArray.length; i++) {
			alternativeArray[i] = alternativeArray[i] * 10;
			System.out.println(alternativeArray[i]);
		}
	}
	
	public int[] enhancedForLoops() {
		int[] nums = new int[20];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		
		return nums;
	}
	
	public boolean oddOrEven(int x) {
		 return (x % 2 == 0);
	}

}
