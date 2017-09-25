/*Anthony Chaya
 * Mini Project 4
 * Outputs image of many asterisks*/
public class MiniProject5 {

	public static void main(String[] args) {
		//Displays the image
		twoFiveThreeFive();
		lineSkip();
		twoFiveThreeFive();
		twoFiveThreeThree();
		twoFiveThreeFive();

	}
	/*Displays two lines of 6 asterisks each 
	 * then 3 lines with 2 asteriks on top, 
	 * one in the middle, and two more on the bottom*/
	public static void twoFiveThreeFive() {
		System.out.println("*****\n*****");
		System.out.println(" * * \n  *  \n * * ");
	}
	/*Displays two lines of 6 asterisks each, then 
	 * skip a line, the three lines with 1 asterik on each*/
	public static void twoFiveThreeThree() {
		System.out.println("*****\n*****");
		System.out.println();
		System.out.println("  *  ");
		System.out.println("  *  ");
		System.out.println("  *  ");
	}
	//Skips a line
	public static void lineSkip() {
		System.out.println();
	}
	
}
