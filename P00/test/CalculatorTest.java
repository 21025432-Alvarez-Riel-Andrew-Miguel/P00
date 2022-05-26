import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		//Arrange
		int a = 1234;
		int b = 8765;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.add(a, b);
		
		//Assert
		int expected = 9999;
		assertEquals(expected,actual);
	}
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		//Arrange
		int c = 9876;
		int d = 4321;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.sub(c, d);
		
		//Assert
		int expected = 5555;
		assertEquals(actual,expected);
	}
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		//Arrange
		int a = 12;
		int b = 60;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.mult(a, b);
		
		//Assert
		int expected = 720;
		assertEquals(expected,actual);
	}
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		//Arrange
		int a = 720;
		int b = 6;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.div(a, b);
		
		//Assert
		int expected = 120;
		assertEquals(expected,actual);
	}

}
