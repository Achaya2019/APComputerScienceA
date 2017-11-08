/*Anthony Chaya 
 * Problem 3
 * checks if the first a in a string is followed by another a and returns true if it does
 */

//imports Scanner Class
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		//declares variabels for string input and boolean
		String input = "";
		boolean in;
		//requests string input from the user
		Scanner strngin = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		input = strngin.nextLine();
		//sets the boolean in to whatever is returned from containsAt
		in = doubleA(input);
		//outputs whether the inputed string is true or false
		if (in) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}



	}
	public static boolean doubleA(String str) {
		//declares length and output for the length of the string and output for the boolean
		int length;
		// creates variable for the string of 2 characters to see if the a and the character after it are both a
		String check = "";
		length = str.indexOf("a");
		check = str.substring(length , length + 2);
		//checks if the variable check is equal to aa and returns true if it is
		if (check.equals("aa")) {
			return true;
		}
		//returns false if the two letters are not aa
		return false;
	}

}
