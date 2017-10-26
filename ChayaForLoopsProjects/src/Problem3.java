/*Anthony Chaya
 * Problem 3
 * creates a triangle from user input
 */

//imports Scanner class
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		//declares variables
		int size;
		//requests input from the user
		Scanner sizeIn = new Scanner(System.in);
		System.out.print("Enter a size: ");
		size = sizeIn.nextInt();
		int cntr;
		int cntr2;
		//calculates and prints the triangle
		for (cntr = 1; cntr <= size; cntr++){
			for (cntr2 = 1; cntr2 <= cntr; cntr2++) {
				System.out.print(cntr);
			}
			System.out.println();
		}
	}

}
