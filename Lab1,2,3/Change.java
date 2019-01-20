

import java.util.Scanner;

public class Change{
	public static void main(String [] args){
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Purchase:");
		double purchase = keyboard.nextDouble();
		System.out.println("Payment:");
		double payment = keyboard.nextDouble();
		
		System.out.println("Given $"+payment+" for a purchase of $"+purchase+" we need");
		double dollar = payment-purchase;
		
		int dollar1 = (int)dollar;
		double dollar100 = dollar*100.0;
		double dollar111 = dollar100+.1;
		int dollar101 = (int)dollar111;
		int dollarint = dollar1*100;
		int change = dollar101 - dollarint;
		
		
	
		int q = change/25;
		int rem = change%25;
		
		int d = rem/10;
		int d2 = rem%10;
		
		
		
		
		System.out.println(dollar1+" dollars "+q+" quarters "+d+" dimes "+d2+" cents");
		
		
		
		
		
	}
}
