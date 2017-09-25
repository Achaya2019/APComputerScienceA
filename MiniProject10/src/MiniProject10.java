/* Anthony Chaya
 * Mini Project 10
 * This progam will display how much a man or woman should way dependin on there height*/

import java.util.Scanner;

public class MiniProject10 {

	public static void main(String[] args) {
		//Declares variables
		int height;
		int male;
		int female;
		int hundred=100;
		int hundredsix=106;
		int maleincrease;
		int femaleincrease;
		Scanner inputheight = new Scanner(System.in);
		
		//Allows the user to input a height in inches
		System.out.print("Please enter the height in inches: ");
		height=inputheight.nextInt();

		//Calculates the recommended weight for men and women
		maleincrease=height-60;
		femaleincrease=height-60;
		maleincrease=maleincrease*7;
		femaleincrease=femaleincrease*6;
		male=maleincrease+hundredsix;
		female=femaleincrease+hundred;
		
		//Prints out the recommended weights
		System.out.println("Recommended Male Weight: " + male);
		System.out.println("Recommended Female Weight " + female);
				
	}

}
