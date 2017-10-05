/*Anthony Chaya
 * Mini Project 8
 * Calculates and displays a sphere's diameter, circumference, surface area, and volume*/
import java.util.Scanner;

public class Miniproject8 {

	public static void main(String[] args) {
		//Declares variables
		double radius;
		double diameter;
		double circumference;
		double sa;
		double volume;
		double Pi=3.14159265359;
		Scanner InputRadius = new Scanner(System.in);
		
		//Allows the user to input a radius
		System.out.println("Enter the radius of a sphere:"	);
		radius = InputRadius.nextDouble();
		
		//Calculations for the diameter, circumference, surface area, and volume
		diameter=2*radius;
		circumference=2*Pi*radius;
		sa=4*Pi*radius*radius;
		volume=(4.0 / 3)*Pi*radius*radius*radius;
		
		//Prints out the diameter of your sphere
		System.out.printf("\nThe diameter of your sphere is: ", diameter	);
		System.out.print(diameter);
		
		//Prints out the circumference of your sphere
		System.out.printf("\nThe circumference of your sphere is: ", circumference	);
		System.out.print(circumference);
		
		//Prints out the surface area of your sphere
		System.out.printf("\nThe surface area of your sphere is: ", sa	);
		System.out.print(sa);
		
		//Prints out the volume of your sphere
		System.out.printf("\nThe volume of your sphere is:	", volume	);
		System.out.print(volume);
		
	}

}
