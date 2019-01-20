package Assignment4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//places a robot on a grid and sends instructions for where the robot should move. 
//Gets destroyed if it moves off the grid
public class Robot {
	public static void readInstructions(String inputFileName, String outputFileName) {
		// must declare these null in order to be closed later
		Scanner line = null;
		Scanner in = null;
		PrintWriter writer = null;
		File input = null;
		File output = null;
		try {
			int height = 0;
			int width = 0;
			int rowLoc = 0;
			int colLoc = 0;
			String text = "";
			// creates the input and output files
			input = new File(inputFileName);
			output = new File(outputFileName);
			writer = new PrintWriter(output);
			// checks if the file exists
			if (input.isFile() && input.canRead()) {
				try {
					// creates a scanner with the data from the input file
					in = new Scanner(input);
					// while loop that cycles through each line of the scanner
					while (in.hasNextLine()) {
						text = in.nextLine();// assigns one line of the scanner
												// to a string
						line = new Scanner(text);// assigns the one line of text
													// to a scanner

						try {
							// collects data for the grid and position of the
							// robot
							height = line.nextInt();
							width = line.nextInt();
							rowLoc = line.nextInt();
							colLoc = line.nextInt();
						} catch (InvalidRobotInstructionException e) {
							// throws exception if variables are not numeric
							throw new InvalidRobotInstructionException();
						}
						if (height <= 0 || width <= 0) {
							// checks if the grid has acceptable dimensions
							throw new InvalidRobotInstructionException();
						}
						while (line.hasNext()) {// while loop for the directions
							String direct = line.next();// takes the direction
							int moves = line.nextInt();// takes the number of
														// moves
							if (rowLoc < 0 || rowLoc > height || colLoc < 0 || colLoc > width) {
								// checks if the robot is on the board
								break;
							}
							// calculates robot's position
							if (direct.equals("N")) {
								rowLoc -= moves;
							} else if (direct.equals("S")) {
								rowLoc += moves;
							} else if (direct.equals("E")) {
								colLoc += moves;
							} else if (direct.equals("W")) {
								colLoc -= moves;
							} else {
								// throws exception if direction is not
								// acceptable
								throw new InvalidRobotInstructionException();
							}
						}
						// checks if robot is on the board
						if (rowLoc < 0 || rowLoc > height || colLoc < 0 || colLoc > width) {
							// If it is not, prints terminated
							writer.println("terminated");
						} else {
							// If it is , prints the location
							writer.println(rowLoc + " " + colLoc);
						}
					}
				} catch (IOException e) {
				} finally {
					// close everything
					writer.close();
					in.close();
					line.close();
				}
			} else {
				// print this if the input file doesn't exist
				System.out.println("Input file not found.");
			}

		} catch (Exception e) {
			// exception for faulty instructions
			throw new InvalidRobotInstructionException();
		}

	}
}
