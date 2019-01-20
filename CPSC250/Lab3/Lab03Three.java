package Lab3;

import java.util.ArrayList;

public class Lab03Three {
	public static int[] getLetters(ArrayList<String> list) {
		int[] numberCount = new int[26];
		char[] lowerAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		// loops through each string and assigns it to a variable
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			// breaks string up into a char array
			char[] c = str.toCharArray();
			// loops through each alphabet character
			for (int j = 0; j < lowerAlphabet.length; j++) {
				// loops through each character in the string
				for (int k = 0; k < c.length; k++) {
					// checks for lower case values
					if (c[k] == lowerAlphabet[j]) {
						numberCount[j]++;
					}
					// checks for upper case values
					if (c[k] == upperAlphabet[j]) {
						numberCount[j]++;
					}
				}
			}
		}
		return numberCount;
	}

}
