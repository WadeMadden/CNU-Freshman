package Lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lab02DebugTest {

	@Test
	public void testFindMaximumWhenHighestIsFirst() {
		int[] array    = { 5, 4, 3 };
		int   expected = 5;
		int   actual   = Lab02Debug.findMaximum( array );
		assertEquals( "Incorrect result", expected, actual );
	}

	@Test
	public void testFindMaximumOfOneValue() {
		int[] array    = { 2012 };
		int   expected = 2012;
		int   actual   = Lab02Debug.findMaximum( array );
		assertEquals( "Incorrect result", expected, actual );
	}

	@Test
	public void testFindMaximumWhenHighestInBetween() {
		int[] array    = { 1, 4, 2, 0 };
		int   expected = 4;
		int   actual   = Lab02Debug.findMaximum( array );
		assertEquals( "Incorrect result", expected, actual );
	}

	@Test
	public void testFindMaximumWhenHighestIsLast() {
		int[] array    = { 1, 2 };
		int   expected = 2;
		int   actual   = Lab02Debug.findMaximum( array );
		assertEquals( "Incorrect result", expected, actual );
	}

	@Test
	public void testFindMaximumAmongNegativeNumbers() {
		int[] array    = { -9, -8, -7, -16, -42 };
		int   expected = -7;
		int   actual   = Lab02Debug.findMaximum( array );
		assertEquals( "Incorrect result", expected, actual );
	}
}