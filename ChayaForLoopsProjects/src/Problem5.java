/*Anthony Chaya
 * Problem 5
 * creates a square with user input
 */

//imports Scanner class
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		//delcares variables
		
		int width;
		int height;
		//requests input fromt the user
		Scanner widthIn = new Scanner(System.in);
		Scanner heightIn = new Scanner(System.in);
		System.out.print("Enter a width: ");
		width = widthIn.nextInt();
		System.out.print("Enter a height: ");
		height = heightIn.nextInt();
		//calls the method widthHeight
		widthHeight(width, height);
	}
	public static void widthHeight(int width, int height) {
		int num = 0;
		System.out.println();
		//calculates the dimensions of the square and prints it
		for (int cntr = 0; cntr < height; cntr++) {
			for(int cntr2 = 0; cntr2 < (width - 3); cntr2++) {
				if (num % 2 == 0 ) {
					System.out.print("+");
				}
				if (num % 2 == 0 ) {
					System.out.print("o");
				}
				if (num % 2 != 0 ) {
					System.out.print("o");
				}
				if (num % 2 != 0 ) {
					System.out.print("+");
				}
			}
			System.out.println();
			num++;
		}
		
	}

}
