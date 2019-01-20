package Lab3;

import java.util.ArrayList;

public class Lab03Two {

	public static int getTally(ArrayList<Integer> list, int number) {
		int tally = 0;
		for (int i : list) {
			if (i == number) {
				tally++;
			}
		}
		return tally;
	}

	public static int getFirstIndex(ArrayList<Integer> list, int number) {
		int index = 0;
		if (list.contains(number)) {
			return list.indexOf(number);
		} else {
			return index - 1;
		}
	}

	public static void doReverse(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			list.add(i, list.remove(list.size() - 1));
		}
	}

	// helper method for getSorted
	public static void swapper(ArrayList<Integer> sorter, int i, int k) {
		int temp = sorter.get(i);
		sorter.set(i, sorter.get(k));
		sorter.set(k, temp);
	}

	public static ArrayList<Integer> getSorted(ArrayList<Integer> one, ArrayList<Integer> two, boolean ascendingly) {

		one.addAll(two);
		// sorts in increasing order
		if (ascendingly == true) {
			int minimum;
			for (int i = 0; i < one.size(); i++) {
				minimum = i;
				for (int k = i + 1; k < one.size(); k++) {
					if (one.get(k) < one.get(minimum)) {
						minimum = k;
					}
				}
				swapper(one, i, minimum);
			}
			// sorts in decreasing order
		} else {
			int maximum;
			for (int i = 0; i < one.size(); i++) {
				maximum = i;
				for (int k = i + 1; k < one.size(); k++) {
					if (one.get(k) > one.get(maximum)) {
						maximum = k;
					}
				}
				swapper(one, i, maximum);
			}

		}
		return one;
	}

	public static ArrayList<Integer> getUnion(ArrayList<Integer> one, ArrayList<Integer> two) {
		ArrayList<Integer> unique = new ArrayList<Integer>();
		ArrayList<Integer> allArray = new ArrayList<Integer>();
		allArray.addAll(two);
		allArray.addAll(one);
		// loop that checks if array has seen the number before. If it hasn't
		// adds to arraylist
		for (int i = 0; i < allArray.size(); i++) {
			int num = allArray.get(i);
			if (!unique.contains(num)) {
				unique.add(num);
			}
		}

		return unique;
	}

	public static ArrayList<Double> getIntersection(ArrayList<Double> one, ArrayList<Double> two) {
		ArrayList<Double> allArray = new ArrayList<Double>();
		ArrayList<Double> bothArray = new ArrayList<Double>();
		allArray.addAll(two);
		allArray.addAll(one);
		// checks which is bigger
		if (one.size() >= two.size()) {
			// cycles through each element in the array
			for (int i = 0; i < one.size(); i++) {
				double num = one.get(i);
				// checks if num is in both arraylists and adds to arraylist if
				// it is a new number
				if (one.contains(num) && two.contains(num)) {
					if (!bothArray.contains(num)) {
						bothArray.add(num);
					}
				}
			}
		}
		// checks which is bigger
		if (two.size() > one.size()) {
			// cycles through each element in the array
			for (int i = 0; i < two.size(); i++) {
				double num = two.get(i);
				// checks if num is in both arraylists and adds to arraylist if
				// it is a new number
				if (one.contains(num) && two.contains(num)) {
					if (!bothArray.contains(num)) {
						bothArray.add(num);
					}
				}
			}
		}
		return bothArray;
	}

	public static ArrayList<String> getDifference(ArrayList<String> one, ArrayList<String> two) {

		ArrayList<String> uniqueArray = new ArrayList<String>();
		// checks if particular string is only in one of the arraylists and adds
		// if this is true
		for (int i = 0; i < one.size(); i++) {
			String str = one.get(i);
			if (one.contains(str) ^ two.contains(str)) {
				if (!uniqueArray.contains(str)) {
					uniqueArray.add(str);
				}
			}
		}
		// checks if particular string is only in one of the arraylists and adds
		// if this is true
		for (int i = 0; i < two.size(); i++) {
			String str = two.get(i);
			if (one.contains(str) ^ two.contains(str)) {
				if (!uniqueArray.contains(str)) {
					uniqueArray.add(str);
				}
			}
		}
		return uniqueArray;
	}
}
