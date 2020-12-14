package database;

import java.util.Scanner;

public class Marine {
	
	private int rank;
	private String lastName;
	private String firstName;
	private String edipi;
	private int dutyStatus;
	private String dutyDesc;
	private static int id = 1000000000;	
	
	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEdipi() {
		return edipi;
	}


	public void setEdipi(String edipi) {
		this.edipi = edipi;
	}


	public int getDutyStatus() {
		return dutyStatus;
	}


	public void setDutyStatus(int dutyStatus) {
		this.dutyStatus = dutyStatus;
	}


	public String getDutyDesc() {
		return dutyDesc;
	}


	public void setDutyDesc(String dutyDesc) {
		this.dutyDesc = dutyDesc;
	}

	
	// Constructor: prompt to enter new Marine's name,rank,status
	public Marine() {
		Scanner in = new Scanner(System.in);
 
		System.out.print("Enter new Marine's last name:  ");
		setLastName(in.nextLine());
		//this.lastName = in.nextLine();
		
		System.out.print("Enter new Marine's first name:  ");
		setFirstName(in.nextLine());
		//this.firstName = ;

		// Show Status
		System.out.print("\n1 - Active\n2 - Inactive\n3 - Reserve\nEnter new Marine's status:  ");
		this.dutyStatus = in.nextInt();
		
			if (dutyStatus == 1) {
				setDutyDesc("Active");
				//System.out.print("Active");			
			}
			if (dutyStatus == 2) {
				setDutyDesc("Inactive");	
				//System.out.print("Inactive");
			}
			if (dutyStatus == 3) {
				setDutyDesc("Reserve");
				//System.out.print("Reserve");
			}			
			
			
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
			
			System.out.println( rank + " " + "| Name: " +  getLastName()  + " " + ", " + getFirstName() + " " + "| EDIPI:" + getEdipi() + " | Active Duty Status: " + getDutyDesc());
			
		}
		
		
		//Generate a 10 digit EDIPI (Electronic Data Interchange Personal Identifier)
		private void setedipi() {
			id++;
			setEdipi("" + id);
		}
	}
	
	