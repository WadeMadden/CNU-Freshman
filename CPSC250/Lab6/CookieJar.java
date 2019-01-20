package Lab6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

// receives a file with different amounts of pennies nickels dimes and quarters and prints to a file the total amount 
public class CookieJar {
	public static void cashingIn(File input, File output) {
		try {
			String s = "";
			double total = 0;
			int j = 0;
			ArrayList<String> list = new ArrayList<String>();
			Scanner in = new Scanner(input);
			PrintWriter out = new PrintWriter(output);
			// concatinates all the strings
			while (in.hasNext()) {
				s = s + " ";
				s = s + in.nextLine();
			}
			// and formats them
			s = s.replaceAll("\\s+", " ");
			s = s.trim();
			// adds each part to an array
			for (String word : s.split(" ")) {
				list.add(word);
			}
			// adds all the money together
			for (int k = 0; k < list.size() / 2; k++) {
				try {
					int num = Integer.parseInt(list.get(j));
					if (list.get(j + 1).equals("pennies") || list.get(j + 1).equals("penny")) {
						for (int i = 0; i < num; i++) {
							total += .01;
						}
					}
					if (list.get(j + 1).equals("nickels") || list.get(j + 1).equals("nickel")) {
						for (int i = 0; i < num; i++) {
							total += .05;
						}
					}
					if (list.get(j + 1).equals("dimes") || list.get(j + 1).equals("dime")) {
						for (int i = 0; i < num; i++) {
							total += .10;
						}
					}
					if (list.get(j + 1).equals("quarters") || list.get(j + 1).equals("quarter")) {
						for (int i = 0; i < num; i++) {
							total += .25;
						}
					}
					j = j + 2;
				} catch (Exception e) {
				}
			}
			// formats the total
			String amount = String.format("$%,.2f", total);
			if (total == 0) {
				out.println("You have no money in the jar");
			} else {
				out.println("You have " + amount + " in the jar");
			}
			out.close();
			in.close();
		} catch (IOException e) {
		}
	}
}
