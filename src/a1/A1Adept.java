package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int items = scan.nextInt();
		
		// put item names and prices into arrays
		String[] itemTypes = new String [items];
		double[] itemPrices = new double [items];
		
		for (int i = 0; i < items; i++) {
			String name = scan.next();
			int price = scan.nextInt();
		}
		
		
		
		
		int totalCustomers = scan.nextInt();
		// make for loop, get first and last name, first name array, last name array
		String[] nameOfCustomers = new String[totalCustomers];
		double[] totalSpent = new double[totalCustomers];
		
		for (int j = 0; j < totalCustomers; j++) {
			nameOfCustomers[j] = scan.next() + " " + scan.next();
		}
		System.out.println("Biggest:" + "Smallest:" + "Average:")
	}
}
