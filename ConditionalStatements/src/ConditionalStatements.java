/*Anthony Chaya
 * Conditional Statements Homework
 * this program will display the absolute value of an integer and find the largest int of three absolute values
 */

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		//delcares variables
		int num1;
		int num2;
		int num3;
		int numLargest;
		
		//allows user input
		Scanner num1input = new Scanner(System.in);
		Scanner num2input = new Scanner(System.in);
		Scanner num3input = new Scanner(System.in);
		
		//requests for user input
		System.out.print("Enter your first integer:");
		num1=num1input.nextInt();
		System.out.print("Enter your second integer:");
		num2=num2input.nextInt();
		System.out.print("Enter your third integer:");
		num3=num3input.nextInt();
		
		//finds the absolute value for num1, num2, and num3
		num1=absValue(num1);
		System.out.print("Your first integer as an absolute value is: " + num1);
		num2=absValue(num2);
		num3=absValue(num3);
		
		numLargest=findLargest(num1, num2, num3);
		System.out.print("\nThe largest number entered was: " + numLargest);
	}
	public static int absValue(int num1) {
		//makes num1 an absolute value if it isn't already
		if (num1 <= 0) {
			num1=num1+(num1*-2);
		}
		//returns num1 as an absolute value
		return num1;
	}
	public static int findLargest(int num1, int num2, int num3) {
		//checks if num1 is the largest
		if (num1>num2 && num1>num3) {
			return num1;
		}
		
		//checks if num2 is the largest
		if (num2>num1 && num2>num3) {
			return num2;
		} else {
			//if both num1 and num2 are not the largest then num3 must be the largest
			return num3;
		}
	}
}
