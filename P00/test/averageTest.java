import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class averageTest {

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
	public void test() {
		//fail("Not yet implemented");
		int a = 5;
		int b = 5;
		int c = 5;
		int d = 5;
		int e = 5;
		
		average av = new average();
		int result = av.ave(a, b, c, d, e);
		
		int expect = 5;
		assertEquals(expect,result);
		
	}

}
