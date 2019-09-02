package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
int items = scan.nextInt();
		
// put item names and prices into arrays
String[] itemNames = new String [items];
int[] numberOfCustomers = new int[items];
int[] numberOfItems = new int[items];

for (int i = 0; i < items; i++) {
	itemNames[i] = scan.next();
	scan.nextDouble();
}
int countOfCustomers = scan.nextInt();
int[][] itemList = new int[countOfCustomers][items];

for (int j = 0; j < countOfCustomers; j++) {
	scan.next();
	scan.next();
	
	int itemAmt = scan.nextInt();
	
	for (int k = 0; k < itemAmt; k++) {
		int x = scan.nextInt();
		String name = scan.next();
		
		for (int l = 0; l < items; l++) {
			if (name.contentEquals(itemNames[l])) {		
				itemList[j][l] += x;
			}
		}

	}
}

for (int k = 0; k < countOfCustomers; k++) {
	for (int l = 0; l < items; l++) {
		if (itemList[k][l] > 0) {
			numberOfCustomers[l] += 1;
			numberOfItems[l] += itemList[k][l];
		} else {
			numberOfCustomers[l] += 0;
		}
	}
}

for (int j = 0; j < items; j++) {
	if (numberOfCustomers[j] == 0) {
		System.out.println("No customers bought " + itemNames[j]);
	} else {
		System.out.println(numberOfCustomers[j] + " customers bought " + numberOfItems[j] + " " + itemNames[j]);
	}
	}
}
}

