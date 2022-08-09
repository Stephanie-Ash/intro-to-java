package com.qa.arrs.runner;

import com.qa.arrs.tasks.ArrayListTrial;
import com.qa.arrs.tasks.ArrayTrials;

public class Runner {

	public static void main(String[] args) {
		ArrayTrials arrayTasks = new ArrayTrials();
		arrayTasks.createArray();
		arrayTasks.createAltArray();
		int[] nums = arrayTasks.enhancedForLoops();
		
		for(int i : nums) {
			System.out.println(i * i);
		}
		
		for(int i : nums) {
			if(arrayTasks.oddOrEven(i)) {
				System.out.println(i * i * i);
			} else {
				System.out.println(i * i);
			}
		}
		
		ArrayListTrial arrayListTasks = new ArrayListTrial();
		arrayListTasks.createArrayList();

	}

}
