/*Anthony Chaya
 * Largest of Three Integers
 * This program takes three integers and displays the largest integer*/

import java.util.Scanner;

public class LargestOfThreeInts {

	public static void main(String[] args) {
		//Declares the variables
		int num1;
		int num2;
		int num3;
		int largestNumber1;
		//Requests for input from the user
		Scanner num1input = new Scanner(System.in);
		Scanner num2input = new Scanner(System.in);
		Scanner num3input = new Scanner(System.in);
		System.out.println("Enter your first integer: ");
		num1 = num1input.nextInt();
		System.out.println("Enter your second integer: ");
		num2 = num2input.nextInt();
		System.out.println("Enter your third integer: ");
		num3 = num3input.nextInt();
		largestNumber1 = largestOfThreeNumbers(num1,num2,num3);
		//Prints out the biggest of the three numbers given
		System.out.print("The largest integer of the three numbers given is: "+ largestNumber1);

	}
	//Calculates the biggest of the three numbers
	public static int largestOfThreeNumbers(int num1, int num2, int num3) {
		int largestNumber;
		largestNumber = Math.max (num1,num2);
		largestNumber = Math.max (largestNumber,num3);
		return largestNumber;
	}

}
