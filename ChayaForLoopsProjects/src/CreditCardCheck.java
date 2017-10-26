/*Anthony Chaya
 * Problem 6
 * checks if a credit card number is valid or not
 */

//imports Scanner class
import java.util.Scanner;

public class CreditCardCheck {

	public static void main(String[] args) {
		//declares variables
		int creditNumber;
		Scanner creditIn = new Scanner(System.in);
		System.out.print("Enter a credit card number: ");
		creditNumber = creditIn.nextInt();
		//runs the method which outputs wether or not the credit card number is valid or not
		creditCardValidatorCheck(creditNumber);
			
		}
	public static void creditCardValidatorCheck(int creditNumber){
		//declares variables
        int cntr;
        int total = 0;
        //calculates the total of the credit cards integers summed up
        for (cntr = 1; cntr <= 8; cntr++) {
        	total = total + (creditNumber % 10);
        }
        //checks if the number is valid or not and prints out the corresponding text
        if (total % 10 == 0) {
        	System.out.println("Your credit card number is valid");
        } else {
        	System.out.println("Your credit card number is not valid");
        }
	}
}


