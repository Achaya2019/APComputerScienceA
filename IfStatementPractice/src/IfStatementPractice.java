/*
 * Anthony Chaya
 * If Statement Practice
 * outputs many different calculations and string results
 */
public class IfStatementPractice {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 10;
		double phoneCallMinutes = 3;
		int largestNum;
		int quotient;
		int remainder;
		double phoneCallPrice;
		int side1 = 90;
		int side2 = 60;
		int side3 = 30;
		String rightTriangle;
		largestNum = largestOfTwo(num1, num2);
		quotient = quotientOfTwoNums(num1, num2);
		remainder = remainderOfTwonums(num1, num2);
		phoneCallPrice = phoneCallPricing(phoneCallMinutes);
		rightTriangle = rightTriangles(side1, side2, side3);

		// Prints out the answers
		System.out.print("The largest number is: " + largestNum);
		System.out.print("\nThe quotient of the numbers is: " + quotient);
		System.out.print("\nThe remainder of the numbers is: " + remainder);
		System.out.print("\nThe price of the phone call is: $" + phoneCallPrice);
		System.out.print("\n" + rightTriangle);

	}

	public static int largestOfTwo(int number1, int number2) {
		// Calculates the largest number and returns it
		if (number1 > number2) {
			return number1;
		} else {
			return number2;
		}
	}

	public static int quotientOfTwoNums(int number1, int number2) {
		// Declares quotient as an integer
		int quotient;
		// Calculates the quotient
		if (number1 > number2) {
			quotient = number1 / number2;
		} else {
			quotient = number2 / number1;
		}
		// Returns the quotient
		return quotient;
	}

	public static String rightTriangles(int side1, int side2, int side3) {
		//Checks if the triangle is right
		String rightTriangle;
		if (side1>side2) {
			if (side1>side3) {
				if (side1*side1==side2*side2+side3*side3) {
					//sets right triangle to text saying The triangle is right
					rightTriangle = "The triangle is right";
				}
			}else {
				if (side2>side1) {
					if (side2>side3) {
						if (side2*side2==side1*side1+side3*side3) {
							//sets right triangle to text saying The triangle is right
							rightTriangle = "The triangle is right";
						}
					}
				}
				//Checks if the triangle is right
				else {
					if (side3>side1) {
						if (side3>side2) {
							if (side3*side3==side1*side1+side2*side2) {
								//sets right triangle to text saying The triangle is right
								rightTriangle = "The triangle is right";
							}
						}
					}
					else {
						//sets right triangle to text saying The triangle is not right
						rightTriangle = "The triangle is not right";
					}
				}
				
			}

		} else {
			return rightTriangle;
		}

		
	} 

	public static int remainderOfTwonums(int number1, int number2) {
		// Declares remainder as an integer
		int remainder;
		// Calculates the remainder
		if (number1 > number2) {
			remainder = number1 % number2;
		} else {
			remainder = number2 % number1;
		}
		// Returns the remainder
		return remainder;
	}

	public static double phoneCallPricing(double normalMinutes) {
		// Declares the needed variables
		double overMinutesPrice;
		double normalMinutesPrice = 1.15;
		double totalPrice;
		// Calculates the pricing of the phone call
		if (normalMinutes > 2) {
			overMinutesPrice = (normalMinutes - 2) * .50;
			totalPrice = overMinutesPrice + normalMinutesPrice;
			return totalPrice;
		} else {
			totalPrice = normalMinutesPrice;
			return totalPrice;
		}
	}

}
