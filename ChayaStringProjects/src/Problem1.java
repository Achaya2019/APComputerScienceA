/*Anthony Chaya 
 * Problem 1
 * Checks if an inputed string has the substring of "@cchs"
 */

//imports Scanner Class
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		//declares variabels for string input and boolean
		String input = "";
		boolean in;
		//requests string input from the user
		Scanner strngin = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		input = strngin.nextLine();
		//sets the boolean in to whatever is returned from containsAt
		in = containsAt(input);
		//outputs whether the inputed string is true or false
		if (in) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
	public static boolean containsAt(String input) {
		//checks if the inputed string includes the substring @cchs and returns true if it is
		if (input.equals("@cchs")) {
			return true;
		}
		//returns false if the string does not contain the substring @cchs
		return false;
	}

}
