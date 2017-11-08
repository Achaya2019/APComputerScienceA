/*Anthony Chaya 
 * Problem 3
 * checks if the first a in a string is followed by another a and returns true if it does
 */

//imports Scanner Class
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		//declares variabels for string input and boolean
		String input = "";
		String in = "";
		//requests string input from the user
		Scanner strngin = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		input = strngin.nextLine();
		//sets the boolean in to whatever is returned from containsAt
		in = printReverse(input);
		//outputs the string variable in 
		System.out.println(in);
	}
	public static String printReverse(String str) {
		//Declares string output for the return statement
		String output = "";
		//reverses the order of the string by printing each character starting from the top
		for (int cntr = str.length() - 1; cntr >= 0; cntr--) {
			output = output + str.charAt(cntr);
		}
		//returns the output
		return output;
	}

}
