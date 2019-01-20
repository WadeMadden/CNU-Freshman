package Lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lab02OneTest {
	/**
	 * Testing "arrayToString"
	 */
	@Test
	public void testArrayToString_EmptyArray() {
		int[]  array    = {};
		String expected = "[]";
		String actual   = Lab02One.arrayToString( array );
		assertEquals( expected, actual );
	}
	@Test
	public void testArrayToString_ArrayOfOne() {
		int[]  array    = { 42 };
		String expected = "[42]";
		String actual   = Lab02One.arrayToString( array );
		assertEquals( expected, actual );
	}
	@Test
	public void testArrayToString_ArrayOfSome() {
		int[]  array    = { 5, -15, 30 };
		String expected = "[5, -15, 30]";
		String actual   = Lab02One.arrayToString( array );
		assertEquals( expected, actual );
	}
	@Test
	public void testArrayToString_ArrayOfMany() {
		int[]  array    = {80, 100, 80, 92, 95, 87, 82, 76, 45, 76, 80, 70};
		String expected = "[80, 100, 80, 92, 95, 87, 82, 76, 45, 76, 80, 70]";
		String actual   = Lab02One.arrayToString( array );
		assertEquals( expected, actual );
	}
	/**
	 * Testing "arraySum"
	 */
	@Test
	public void testArraySum_EmptyArray() {
		int[] array    = {};
		int   expected = 0;
		int   actual   = Lab02One.arraySum( array );
		assertEquals( expected, actual );
	}
	@Test
	public void testArraySum_ArrayOfOne() {
		int[] array    = { 42 };
		int   expected = 42;
		int   actual   = Lab02One.arraySum( array );
		assertEquals( expected, actual );
	}
	@Test
	public void testArraySum_ArrayOfSome() {
		int[] array    = { 5, -15, 30 };
		int   expected = 20;
		int   actual   = Lab02One.arraySum( array );
		assertEquals( expected, actual );
	}
	@Test
	public void testArraySum_ArrayOfMany() {
		int[] array    = {80, 100, 80, 92, 95, 87, 82, 76, 45, 76, 80, 70};
		int   expected = 963;
		int   actual   = Lab02One.arraySum( array );
		assertEquals( expected, actual );
	}
	/**
	 * Testing "arrayAverage"
	 */
	@Test
	public void testArrayAverage_EmptyArray() {
		int[]  array    = {};
		double expected = 0.0;
		double actual   = Lab02One.arrayAverage( array );
		assertEquals( expected, actual, 0 );
	}
	@Test
	public void testArrayAverage_ArrayOfOne() {
		int[]  array    = { 42 };
		double expected = 42.0;
		double actual   = Lab02One.arrayAverage( array );
		assertEquals( expected, actual, 0 );
	}
	@Test
	public void testArrayAverage_ArrayOfSome() {
		int[]  array    = { 5, -15, 30 };
		double expected = 6.66667;
		double actual   = Lab02One.arrayAverage( array );
		assertEquals( expected, actual, 0.00001 );
	}
	@Test
	public void testArrayAverage_ArrayOfMany() {
		int[]  array    = {80, 100, 80, 92, 95, 87, 82, 76, 45, 76, 80, 70};
		double expected = 80.25;
		double actual   = Lab02One.arrayAverage( array );
		assertEquals( expected, actual, 0 );
	}
}
