package ArrayLists;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayList1Test {

	@Test
	public void testCountNameListEmpty() {
		ArrayList<String> list = new ArrayList<String>();
		String name = "zero";
		int actual = ArrayList1.countNames(list, name);
		assertEquals("Incorrect result", 0, actual);
	}

	@Test
	public void testCountNameListOfOneButNotFound() {
		String[] array = { "zero" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));

		String name = "one";
		int actual = ArrayList1.countNames(list, name);
		assertEquals("Incorrect result", 0, actual);
	}

	@Test
	public void testCountNameListOfOneAndFound() {
		String[] array = { "one" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));

		String name = new String("one");
		int actual = ArrayList1.countNames(list, name);
		assertEquals("Incorrect result", 1, actual);
	}

	@Test
	public void testCountNameListOfManyAndNotFound() {
		String[] array = { "one", "two", "one", "two" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));

		String name = new String("five");
		int actual = ArrayList1.countNames(list, name);
		assertEquals("Incorrect result", 0, actual);
	}

	@Test
	public void testCountNameManyFound() {
		String[] array = { "one", "two", "one", "two" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));

		String name = new String("two");
		int actual = ArrayList1.countNames(list, name);
		assertEquals("Incorrect result", 2, actual);
	}

	@Test
	public void testGetShorterThanEmpty() {
		ArrayList<String> list = new ArrayList<String>();
		int length = 6;
		ArrayList<String> actual = ArrayList1.getShorterThan(list, length);
		assertEquals("Incorrect result", 0, actual.size());
	}

	@Test
	public void testGetShorterThanNoneWhenMany() {
		String[] array = { "Super", "Trouper", "beams", "are", "gonna", "blind", "me" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
		int length = 2;

		ArrayList<String> actual = ArrayList1.getShorterThan(list, length);
		assertEquals("Incorrect result", 0, actual.size());
	}

	@Test
	public void testGetShorterThanSomeWhenMany() {
		String[] array = { "Super", "Trouper", "beams", "are", "gonna", "blind", "me" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
		int length = 5;

		ArrayList<String> actual = ArrayList1.getShorterThan(list, length);
		assertEquals(2, actual.size());
		assertTrue("Incorrect result", actual.contains("are"));
		assertTrue("Incorrect result", actual.contains("me"));
	}

	@Test
	public void testGetShorterThanAllWhenMany() {
		String[] array = { "Super", "Trouper", "beams", "are", "gonna", "blind", "me" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
		int length = 8;

		ArrayList<String> actual = ArrayList1.getShorterThan(list, length);
		assertEquals("Incorrect result", 7, actual.size());
		assertTrue("Incorrect result", actual.contains("Super"));
		assertTrue("Incorrect result", actual.contains("Trouper"));
		assertTrue("Incorrect result", actual.contains("beams"));
		assertTrue("Incorrect result", actual.contains("are"));
		assertTrue("Incorrect result", actual.contains("gonna"));
		assertTrue("Incorrect result", actual.contains("blind"));
		assertTrue("Incorrect result", actual.contains("me"));
	}

}