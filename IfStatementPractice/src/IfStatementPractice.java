
public class IfStatementPractice {

	public static void main(String[] args) {
		int num1=20;
		int num2=10;
		double phoneCallMinutes=3;
		int largestNum;
		int quotient;
		int remainder;
		double phoneCallPrice;
		largestNum=largestOfTwo(num1,num2);
		quotient=quotientOfTwoNums(num1,num2);
		remainder=remainderOfTwonums(num1,num2);
		phoneCallPrice=phoneCallPricing(phoneCallMinutes);
		System.out.print("The largest number is: " + largestNum);
		System.out.print("\nThe quotient of the numbers is: " + quotient);
		System.out.print("\nThe remainder of the numbers is: " + remainder);
		System.out.print("\nThe price of the phone call is: $" + phoneCallPrice);
		
		

	}
	public static int largestOfTwo(int number1, int number2) {
		//Calculates the largest number and returns it
		if (number1>number2){
			return number1;
		}
		else {
			return number2;
		}
	}
	public static int quotientOfTwoNums(int number1,int number2) {
		//Declares quotient as an integer
		int quotient;
		//Calculates the quotient
		if (number1>number2) {
			quotient=number1/number2;
		}else{
			quotient=number2/number1;
		}
		//Returns the quotient
		return quotient;
	}
	public static int remainderOfTwonums(int number1, int number2){
		//Declares remainder as an integer
		int remainder;
		//Calculates the remainder
		if (number1>number2) {
			remainder=number1%number2;
		}else{
			remainder=number2%number1;
		}
		//Returns the remainder
		return remainder;
	}
	public static double phoneCallPricing(double normalMinutes) {
		double overMinutesPrice;
		double normalMinutesPrice=1.15;
		double totalPrice;
		if (normalMinutes>2){
			overMinutesPrice= (normalMinutes-2) * .50;
			totalPrice=overMinutesPrice+normalMinutesPrice;
			return totalPrice;
		} else {
			totalPrice=normalMinutesPrice;
			return totalPrice;
		}
	}

}
