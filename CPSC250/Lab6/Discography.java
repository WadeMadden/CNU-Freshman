package Lab6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//given a file with artist, album and all song times. Formats alphabetically by artist and adds all times
public class Discography {
	public static void writeReport(File input, File output) {
		try {
			List<String> first = new ArrayList<String>();
			ArrayList<String> second = new ArrayList<String>();
			Scanner in = new Scanner(input);
			PrintWriter out = new PrintWriter(output);

			while (in.hasNext()) {
				int hour = 0;
				int minute = 0;
				int seconds = 0;
				String str = in.nextLine();
				// adds entire line of strings to an arraylist
				first = Arrays.asList(str.split("\\s*,\\s*"));
				// adds separate parts to a new array
				second.add(first.get(1));
				second.add(first.get(0));
				// calculates total minutes and seconds
				for (int i = 2; i < first.size(); i++) {
					String[] time = first.get(i).split(":");
					minute += Integer.parseInt(time[0]);
					seconds += Integer.parseInt(time[1]);
				}
				if (seconds >= 60) {
					int i = 0;
					for (i = 0; seconds >= 60; i++) {
						seconds -= 60;
					}
					minute += i;
				}
				if (minute >= 60) {
					int i = 0;
					for (i = 0; minute >= 60; i++) {
						minute -= 60;
					}
					hour += i;
				}
				// formats time correctly
				String minutes = String.format("%02d", minute);
				String seconds1 = String.format("%02d", seconds);
				String allTime = hour + ":" + minutes + ":" + seconds1;
				// adds to array
				second.add(allTime);

			}
			ArrayList<String> last = new ArrayList<String>();
			// used for formatting the artists correctly. Determines artist with
			// the most characters and formats others accordingly
			for (int i = 0; i < second.size(); i += 3) {
				int bigArtist = 0;
				for (int j = 0; j < second.size(); j += 3) {
					if (second.get(j).length() > bigArtist) {
						bigArtist = second.get(j).length();
					}
				}
				String newArtist = String.format("%-" + bigArtist + "s", second.get(i));
				second.set(i, newArtist);
			}
			// used for formatting the artists correctly. Determines album with
			// the most characters and formats others accordingly
			for (int i = 1; i < second.size(); i += 3) {
				int bigAlbum = 0;
				for (int j = 1; j < second.size(); j += 3) {
					if (second.get(j).length() > bigAlbum) {
						bigAlbum = second.get(j).length();
					}
				}
				String newArtist = String.format("%-" + bigAlbum + "s", second.get(i));
				second.set(i, newArtist);
			}
			// adds all info to the last arraylist
			for (int i = 0; i < second.size(); i += 3) {
				String str = second.get(i) + " | " + second.get(i + 1) + " | " + second.get(i + 2);
				last.add(str);
			}
			// sorts alphabetically
			Collections.sort(last);
			// sends results to output file
			for (int i = 0; i < last.size(); i++) {
				out.println(last.get(i));
			}

			in.close();
			out.close();
		} catch (IOException e) {
		}
	}
}
