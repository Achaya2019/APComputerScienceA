/*Anthony Chaya 
 * Problem 3
 * checks if the first a in a string is followed by another a and returns true if it does
 */

//imports Scanner Class
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		//declares variabels for string input and boolean
		String input = "";
		String in = "";
		//requests string input from the user
		Scanner strngin = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		input = strngin.nextLine();
		//sets the boolean in to whatever is returned from containsAt
		in = stringBuildup(input);
		//outputs the string variable in 
		System.out.println(in);
	}
	public static String stringBuildup(String str) {
		//declares the variables length and string
		int length = str.length();
		String str2 = "";
		//continues to add string to str2 until the final string is reached
		for (int length2 = 1; length2 <= length; length2++) {
			str2 = str2 + str.substring(0, length2);
			
		}
		//returns string str2
		return str2;
	}

}
