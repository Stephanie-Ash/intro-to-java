package com.qa.arrs.tasks;

public class ArrayTrials {
	int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
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
	
	public void enhancedForLoops() {
		for(int i : nums) {
			System.out.println(i * i);
		}
		
		for(int i : nums) {
			if(oddOrEven(i)) {
				System.out.println(i * i * i);
			} else {
				System.out.println(i * i);
			}
		}
	}
	
	public boolean oddOrEven(int x) {
		 return (x % 2 == 0);
	}

}
