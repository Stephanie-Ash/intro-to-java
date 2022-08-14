package qa.com.junit.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import qa.com.junit.code.TemperatureConverter;

public class TestTemperatureConverter {
	private TemperatureConverter converter;
	
	@BeforeClass
	public void setUp() {
		converter = new TemperatureConverter();
	}
	
	@Test
	public void testConvertsKelvinToCelcius() {
		float result = converter.convertKelvinToCelsius(300);
	}

}
