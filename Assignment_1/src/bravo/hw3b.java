package bravo;

import java.util.Scanner;
public class hw3b {

	public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
   
    System.out.print("Type your 1st number value: ");
    int num1 = input.nextInt();
     
    System.out.print("Type your 2nd number value: ");
    int num2 = input.nextInt();
     
    System.out.print("Type your 3rd number value: ");
    int num3 = input.nextInt();
    
    input.close();
     
    if (num1 > num2)
     if (num1 > num3)
      System.out.println("Your greatest value is: " + num1);
     
    if (num2 > num1)
     if (num2 > num3)
      System.out.println("Your greatest value is: " + num2);
     
    if (num3 > num1)
     if (num3 > num2)
      System.out.println("Your greatest value is: " + num3);

	}

}
