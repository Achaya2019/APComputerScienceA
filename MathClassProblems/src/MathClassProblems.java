
public class MathClassProblems {

	public static void main(String[] args) {
		

	}
	public static int mathMinimum(int num1, int num2, int num3, int smallNumber) {
		smallNumber = Math.min(num1,num2);
		smallNumber = Math.min(smallNumber, num3);
		
		return smallNumber;
	}
}
