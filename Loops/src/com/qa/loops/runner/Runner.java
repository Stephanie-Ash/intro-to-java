package com.qa.loops.runner;

import com.qa.loops.tasks.Coins;
import com.qa.loops.tasks.Flowcharts;

public class Runner {

	public static void main(String[] args) {
		Flowcharts chart = new Flowcharts();
//		chart.chartOne();
//		chart.chartTwo();
//		chart.printNumbers();
//		chart.printNumbers2();
		
		Coins change = new Coins();
		change.calculateChange(7.95f, 30.00f);

	}

}
