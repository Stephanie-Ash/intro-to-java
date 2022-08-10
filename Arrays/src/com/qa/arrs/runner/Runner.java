package com.qa.arrs.runner;

import com.qa.arrs.tasks.ArrayListTrial;
import com.qa.arrs.tasks.ArrayTrials;

public class Runner {

	public static void main(String[] args) {
		ArrayTrials arrayTasks = new ArrayTrials();
		arrayTasks.createArray();
		arrayTasks.createAltArray();
		arrayTasks.enhancedForLoops();
		
		ArrayListTrial arrayListTasks = new ArrayListTrial();
		arrayListTasks.createArrayList();

	}

}
