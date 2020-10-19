package alpha;

import java.util.Scanner;

public class integer_class_2 {
	   public static void main(String[] args)   {
		   
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        
	        int number = input.nextInt();
	        int first = 1;
	        
	        int sum = number + first;
	        
	        System.out.println("Your sum is: " + sum);
	        
	       input.close();
	   }
}
