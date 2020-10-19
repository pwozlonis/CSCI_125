package bravo;

import java.util.Scanner;

public class hm3 {

	public static void main(String[] args) {
		
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number to check if it's positive or negative:");

        n = input.nextInt();
	    input.close();
        if(n > 0)
        	
        {

            System.out.println("The number you've entered "+n+" is Positive");

        }

        else if(n < 0)

        {

            System.out.println("The number you've entered "+n+" is Negative");

        }

        else

        {

            System.out.println("The number you've entered "+n+" is neither Positive or Negative ");

        }
        
	}

}
