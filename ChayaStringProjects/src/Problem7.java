/*Anthony Chaya 
 * Problem 3
 * checks if the first a in a string is followed by another a and returns true if it does
 */

//imports Scanner Class
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		//declares variabels for string input and boolean
		String input = "";
		String in = "";
		//requests string input from the user
		Scanner strngin = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		input = strngin.nextLine();
		//sets the boolean in to whatever is returned from containsAt
		in = processName(input);
		//outputs the string variable in 
		System.out.println(in);
	}
	public static String processName(String str) {
		//delcares two different lengths to be able to seperate the first and last name
		int length = str.length();
		int length1 = str.indexOf(" ");
		//adds the first name inputed and seperates it into strNew
		String strNew = str.substring(0, length1);
		//puts the last name before the first and adds a comma
		strNew = str.substring(length1 + 1, length) + ", " + strNew;
		//returns the new string
		return strNew;
	}

}
