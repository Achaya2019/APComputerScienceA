
/*Anthony Chaya 
 * Problem 2
 * outputs the string without the first and last characters
 */

//imports Scanner Class
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		//declares variabels for string input and boolean
		String input = "";
		String in = "";
		//requests string input from the user
		Scanner strngin = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		input = strngin.nextLine();
		//sets the boolean in to whatever is returned from containsAt
		in = withoutEnds(input);
		//prints out the final string
		System.out.println(in);

	}
	public static String withoutEnds(String str) {
		//declares length and output for the length of the string and output for the string
		int length;
		String output = "";
		length = str.length();
		//sets the string variable output to the new string without the first and last characters
		output = str.substring(1, length - 1);
		//returns the output
		return output;
	}

}
