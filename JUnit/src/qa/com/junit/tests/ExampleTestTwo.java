package qa.com.junit.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTestTwo {
	@Test
	public void playerWinsTest() {
	    int blackJack = 21;
	    assertEquals("Expected: Player wins with 21", 21, blackJack);
	}

}
