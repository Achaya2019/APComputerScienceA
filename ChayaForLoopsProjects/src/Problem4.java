/*Anthony Chaya
 * Problem 4
 * creates a triangle on the opposite side from user input
 */

//imports Scanner class
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		//declares variables
		int size;
		//requests input from the user
		Scanner sizeIn = new Scanner(System.in);
		System.out.print("Enter a size: ");
		size = sizeIn.nextInt();
		int cntr;
		int cntr2;
		int cntr3;
		String spaces = "";
		//calculates and prints the opposite facing triangle
		for (cntr = 1; cntr <= size; cntr++){
			for (cntr3 = size; cntr3 >= cntr; cntr3--) {
				System.out.print(" ");
			}
				for (cntr2 = 1; cntr2 <= cntr; cntr2++) {
					System.out.print(cntr);
				}
			System.out.println();
		}
	}

}


