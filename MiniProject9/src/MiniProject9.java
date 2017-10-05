/*Anthony Chaya
 * Mini Project 9
 * Calculates the area of a trapezoid*/

import java.util.Scanner;
public class MiniProject9 {

	public static void main(String[] args) {
		System.out.println("Area of Trapezoid Calculator");
		//Declares variables
		double height;
		double bottom;
		double top;
		double area;
		Scanner inputheight=new Scanner(System.in);
		Scanner inputbottom=new Scanner(System.in);
		Scanner inputtop=new Scanner(System.in);
		
		//Allows the user to input a height
		System.out.println("\nEnter the height of the trapezoid:");
		height=inputheight.nextDouble();
		
		//Allows the user to input a bottom base
		System.out.println("\nEnter the length of the bottom base:");
		bottom=inputbottom.nextDouble();
		
		//Allows the user to input a top base
		System.out.println("\nEnter the length of the top base:");
		top=inputtop.nextDouble();
	    
		//Calculates the area
		area=1.0/2.0 * (bottom+top) * height;
		
		System.out.printf("The area is:  ", area	);
		System.out.print(area);

	}

}
