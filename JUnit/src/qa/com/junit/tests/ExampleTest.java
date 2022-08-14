package qa.com.junit.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExampleTest {
	@BeforeClass
	public static void setup() {
	    System.out.println("Before class");
	}

	@Before
	public void init() {
	    System.out.println("Before test");
	}

	@Test
	public void test1() {
	    System.out.println("Test 1");
	}

	@Test
	public void test2() {
	    System.out.println("Test 2");
	}

	@After
	public void finalise() {
	    System.out.println("After test");
	}

	@AfterClass
	public static void teardown() {
	    System.out.println("After class");
	}

}
