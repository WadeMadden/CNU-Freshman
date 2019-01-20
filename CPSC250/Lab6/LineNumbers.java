package Lab6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

//Formats a file of strings and adds numbers in front
public class LineNumbers {
	public static void process(File input, File output) {
		try {
			ArrayList<String> list = new ArrayList<String>();
			int i = 1;
			Scanner in = new Scanner(input);
			PrintWriter out = new PrintWriter(output);
			// create the array of each string
			while (in.hasNext()) {
				String s = in.nextLine();
				list.add(s);
			}
			in.close();
			for (String line : list) {
				String num = String.format("%3s", i);
				out.println(num + " | " + line);
				i++;
			}
			out.close();
		} catch (IOException e) {
		}
	}
}
