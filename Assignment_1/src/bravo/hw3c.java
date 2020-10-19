package bravo;

import java.util.Scanner;
public class hw3c {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Input a number 1-7 to see what day it is:");
		int day = input.nextInt();
		
		System.out.println(nameOfDay(day));
	    input.close();
	    
		}
	
	public static String nameOfDay(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid, enter values 1-7 only";
        }

        return dayName;
		
	}

}
