package ArrayLists;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayList2Test {

	@Test
	public void testDeleteAtEvenWhenListEmpty() {
		ArrayList<String> list = new ArrayList<String>();

		ArrayList2.deleteAtEven(list);
		assertEquals("Incorrect result", 0, list.size());
	}

	@Test
	public void testDeleteAtEvenWhenListHasTwo() {
		String[] array = { "zero", "one" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));

		ArrayList2.deleteAtEven(list);
		assertEquals("Incorrect result", 1, list.size());
		assertEquals("Incorrect result", "one", list.get(0));
	}

	@Test
	public void testDeleteAtEvenWhenListHasMany() {
		String[] array = { "zero", "one", "two", "three", "four", "five" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));

		ArrayList2.deleteAtEven(list);
		assertEquals("Incorrect result", 3, list.size());
		assertEquals("Incorrect result", "one", list.get(0));
		assertEquals("Incorrect result", "three", list.get(1));
		assertEquals("Incorrect result", "five", list.get(2));
	}

	@Test
	public void testRemoveDuplicatesWhenListIsEmpty() {
		ArrayList<String> list = new ArrayList<String>();

		ArrayList2.deleteDuplicates(list);
		assertEquals("Incorrect result", 0, list.size());
	}

	@Test
	public void testRemoveDuplicatesWhenListHasOneDuplicate() {
		String[] array = { new String("zero"), "one", "two", new String("zero") };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));

		ArrayList2.deleteDuplicates(list);
		assertEquals("Incorrect result", 3, list.size());
		assertTrue("Incorrect result", list.contains("zero"));
		assertTrue("Incorrect result", list.contains("one"));
		assertTrue("Incorrect result", list.contains("two"));
	}

	@Test
	public void testRemoveDuplicatesWhenListHasSeveralDuplicates() {
		String[] array = { new String("zero"), "six", new String("one"), "six", "six", "five", new String("two"),
				"four", new String("three"), "three", new String("four"), "two", new String("five"), "one",
				new String("six"), "zero" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));

		ArrayList2.deleteDuplicates(list);
		assertEquals("Incorrect result", 7, list.size());
		assertTrue("Incorrect result", list.contains("zero"));
		assertTrue("Incorrect result", list.contains("one"));
		assertTrue("Incorrect result", list.contains("two"));
		assertTrue("Incorrect result", list.contains("three"));
		assertTrue("Incorrect result", list.contains("four"));
		assertTrue("Incorrect result", list.contains("five"));
		assertTrue("Incorrect result", list.contains("six"));
	}

}