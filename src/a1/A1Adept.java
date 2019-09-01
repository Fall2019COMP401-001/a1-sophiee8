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
			itemTypes[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		
		
		
		int totalCustomers = scan.nextInt();
		// make for loop, get first and last name, first name array, last name array
		String[] nameOfCustomers = new String[totalCustomers];
		double[] totalSpent = new double[totalCustomers];
		
		for (int j = 0; j < totalCustomers; j++) {
			nameOfCustomers[j] = scan.next() + " " + scan.next();
			int itemAmount = scan.nextInt();
			
			for (int k = 0; k < itemAmount; k++) { 
				int singleItemQuantity = scan.nextInt();
				String singleItemName = scan.next();
				
				double cost = 0.0;
				
				for (int l = 0; l < items; l++) {
					if (singleItemName.equals(itemTypes[l])) {
						cost = itemPrices[l] * Double.valueOf(singleItemQuantity); 
					}
				}
				totalSpent[j] += cost;

				
			}
		}
		int largestIndex = 0;
		int smallestIndex = 0;
			
		for (int i = 0; i < totalCustomers; i++) {
			if (totalSpent[i] > totalSpent[largestIndex]) {
				largestIndex = i;
			}		
			if (totalSpent[i] < totalSpent[smallestIndex]) {
				smallestIndex = i;
			}

		}
		scan.close();
		double valueSum = 0.0;		
		for (int i=0; i<totalCustomers; i++) {
				valueSum += totalSpent[i];
			}
		// names at biggest, customer totals at biggest
				System.out.println("Biggest:" + " " + nameOfCustomers[largestIndex] + " (" + String.format("%.2f", totalSpent[largestIndex]) + ")");
				System.out.println("Smallest:" + " " + nameOfCustomers[smallestIndex] + " (" + String.format("%.2f", totalSpent[smallestIndex]) + ")");
				System.out.println("Average:" + " " + String.format("%.2f", (valueSum) / (Double.valueOf(totalCustomers))));
				
		}
	}

	
	
	
	