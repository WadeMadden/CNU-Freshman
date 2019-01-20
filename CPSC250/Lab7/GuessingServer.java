package Lab7;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//client will choose a number and send either high, low, won, or lost 
//after the server sends back its guess
public class GuessingServer {
	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			// open a new server socket
			server = new ServerSocket(5150);
			System.out.println("opening");
			boolean tester = false;
			while (!tester) {
				int lower = 0;// low limit
				int upper = 0;// upper limit
				int guess = 0;// the server's guess
				Socket socket = server.accept();
				Scanner scanner = new Scanner(socket.getInputStream());
				PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
				boolean exit = false;
				System.out.println("accepting");
				while (!exit) {
					String qual = scanner.nextLine();
					System.out.println(qual);
					String limits[] = qual.split(" ");
					// used for getting initial limits

					if (qual.equals("high")) {
						// calculation if client sends high
						upper = guess;
						guess = (lower + guess) / 2;
						writer.println(guess);
					} else if (qual.equals("low")) {
						// claculation if client sends low
						lower = guess;
						guess = (upper + guess) / 2;
						writer.println(guess);
					} else if (qual.equals("won") || qual.equals("lost")) {
						// server ends if won or lost are sent
						exit = true;
					} else if (qual.equals("SHUT DOWN")) {
						// immediatly ends server
						tester = true;
						exit = true;
					} else {
						lower = Integer.parseInt(limits[0]);
						upper = Integer.parseInt(limits[1]);
						guess = (lower + upper) / 2;
						writer.println(guess);
					}
				}
				System.out.println("closing");
				// close everything
				scanner.close();
				writer.close();
				socket.close();
			}
			server.close();
			System.out.println("shutting down");
		} catch (IOException e) {
			System.out.println("i found an exception");
		}

	}
}
