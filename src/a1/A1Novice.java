package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		// Your code follows here.
		int customers = scan.nextInt();
		
		
		
		for (int i = 0; i < customers; i++) {
			String first = scan.next();
			String last = scan.next();
			
			int items = scan.nextInt();
			
		
			// declare total spent variable
			double total = 0; 
			String.format("%.2f", total); 
			for (int j = 0; j < items; j++) {
				
				int quantity = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
				// add to total spent
				double cost = quantity * price;
				total = total + cost;
			}
			
			System.out.println(first.substring(0, 1) + ". " + last + ": "+ total);
			
			
			// print total spent 
			
		}
	}
}


