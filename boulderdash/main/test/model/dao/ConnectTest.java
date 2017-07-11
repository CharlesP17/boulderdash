package model.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConnectTest {
	
	 Connect connect = new Connect() ;

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

	/*@Test
	public void testConnect() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testConnection() {
		
        final int expectedmin = 1;
        final int expectedmax = 5;
        
        assertTrue(expectedmin <= Connect.idlevel);
        assertTrue(expectedmax >= Connect.idlevel);
	}

	@Test
	public void testSplit() {
		
		final int expected = 420;
		
		assertEquals(expected, this.connect.getWordmap().length());
	}

}
