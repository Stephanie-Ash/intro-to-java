package com.qa.junit.exercise;

import org.junit.BeforeClass;
import org.junit.Test;

public class TemperatureConverterTest {
	private TemperatureConverter converter;
	
	@BeforeClass
	public void setUp() {
		converter = new TemperatureConverter();
	}
	
	@Test
	public void testConvertsFromFarenheitToCelcius() {
		float result = converter.convertFahrenheitToCelsius(32);
		
		a
	}

}
