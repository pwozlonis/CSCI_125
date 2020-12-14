package database;

import java.util.Scanner;

public class EnlistedMarineApp {

	public static void main(String[] args) {

		// Ask how many new personnel to add
		System.out.print("Enter number of new Marines to add: ");
		Scanner in = new Scanner(System.in);
		int numOfMarines = in.nextInt();
		Marine[] marines = new Marine[numOfMarines];
		// Create x number of new Marines
		for (int x = 0; x <numOfMarines; x++) {
			marines[x] = new Marine();
		}
	}
}
