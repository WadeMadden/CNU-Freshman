package Lab3;

import java.util.Arrays;

public class Lab03One {

	public static Double getMedian(Integer[] array) {
		Double median = 0.0;
		// sorts array numerically
		Arrays.sort(array);
		// deals with empty arrays
		if (array.length == 0) {
			return median;
			// deals with arrays with an even amount of numbers
		} else if (array.length % 2 == 0) {
			median = ((double) array[array.length / 2] + (double) array[array.length / 2 - 1]) / 2;
			// deals with arrays with an odd amount of numbers
		} else {
			median = (double) array[array.length / 2];
		}
		return median;
	}

	public static Character[] getDigits(Character[] array) {
		Character[] newArray = new Character[array.length];
		// array containing number characters
		Character[] digitArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		int k = 0;
		// tests to see if each value in the array is equal to any of the values
		// in the digit array
		for (int i = 0; i < array.length; i++) {
			for (int u = 0; u < digitArray.length; u++) {
				if (array[i] == digitArray[u]) {

					newArray[k] = array[i];
					k++;
				}
			}

		}
		// creates a new array with the correct length containing the
		// charachters
		Character[] newerArray = new Character[k];
		for (int i = 0; i < k; i++) {
			newerArray[i] = newArray[i];
		}

		return newerArray;
	}
}
