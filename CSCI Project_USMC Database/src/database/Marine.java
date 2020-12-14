package database;

import java.util.Scanner;

public class Marine {
	private int rank;
	private String lastName;
	private String firstName;
	private String edipi;
	private boolean dutyStatus;
	private static int id = 1000000000;
	
	// Constructor: prompt to enter new Marine's name,rank,status
	public Marine() {
		Scanner in = new Scanner(System.in);
	
		System.out.print("Enter new Marine's last name:  ");
		this.lastName = in.nextLine();
		
		System.out.print("Enter new Marine's first name:  ");
		this.firstName = in.nextLine();
		
		// Show Rank
		System.out.print("\n1 - Private\n2 - Private First Class\n3 - Lance Corpral\n4 - Corpral\n5 - Sergeant\n6 - Staff Sergeant\n7 - Gunnery Sergeant\n8 - First Sergeant\nEnter new Marine's rank grade:  ");
		this.rank = in.nextInt();
		
			if (rank == 1) {
				System.out.print("Private E-");			
			}
			if (rank == 2) {
				System.out.print("Private First Class E-");
			}
			if (rank == 3) {
				System.out.print("Lance Corpral E-");
			}
			if (rank == 4) {
				System.out.print("Corpral E-");
			}
			if (rank == 5) {
				System.out.print("Sergeant E-");
			}
			if (rank == 6) {
				System.out.print("Staff Sergeant E-");
			}
			if (rank == 7) {
				System.out.print("Gunnery Sergeant E-");
			}
			if (rank == 8) {
				System.out.print("First Sergeant E-");
			}
		
		
			
		setedipi();
	
		System.out.println( rank + " " + "| Name: " + lastName + " " + ", " + firstName + " " + "| EDIPI:" + edipi);
		
	}
	
	
	//Generate a 10 digit EDIPI (Electronic Data Interchange Personal Identifier)
	private void setedipi() {
		id++;
		this.edipi = "" + id;
	}
}
