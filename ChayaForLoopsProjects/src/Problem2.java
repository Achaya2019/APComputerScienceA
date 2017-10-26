/*Anthony Chaya
 * Problem 2
 * calculates the class average 
 */

//imports the scanner class
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		//declares variable
		int numGrades;
		//requests input from the user
		Scanner inNum = new Scanner(System.in);
		System.out.print("How many grades would you like to enter? ");
		numGrades = inNum.nextInt();
		int cntr;
		double totalGrades = 0;
		//for statement for the amount of grades to be entered
		for (cntr = 1; cntr <= numGrades; cntr++) {
			Scanner inTot = new Scanner(System.in);
			System.out.print("Enter grade #" + cntr + ": ");
			totalGrades = totalGrades + inTot.nextDouble();
		}
		//calculates and rounds the average Grade
		double avgGrade;
		avgGrade = totalGrades / numGrades;
		avgGrade = Math.round(avgGrade);
		//Displays the average grade
		System.out.print("Your class average is: " + avgGrade);
		}

	}


