/*Anthony Chaya
 * Problem 1
 * calculates the sum of the squares up to a number inputted by the user
 */

//imports Scanner class for input from user
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		//declares variables
		int num;
		//requests input from the user
		Scanner numIn = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num= numIn.nextInt();
		//declares the variable answer
		int answer;
		answer = sumSquares(num);
		//prints out the answer
		System.out.println("The sum of the squares up to " + num + " is: " + answer);

	}
	//method to calculate the sum of the squares
	public static int sumSquares(int num) {
		//declares variables
		int cntr;
		int answer = 0;
		//for statement for the sum of the squares
		for (cntr = 0; cntr <= num; cntr++) {
			answer = answer + cntr * cntr;
			
		}
		//returns the integer answer
		return answer;

	}
}
