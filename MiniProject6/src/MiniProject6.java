/*Anthony Chaya
 * Mini Project 6
 * Outputs image of many asterisks nad straight lines*/
public class MiniProject6 {

	public static void main(String[] args) {
		//Displays the image
		pyramid();
		lineSkip();
		pyramid();
		straightLines();
		thirteenAsteriks();
		pyramid();
		lineSkip();
		pyramid();
		fiveAsteriks();
		straightLines();
		straightLines();
		fiveAsteriks();
		fiveAsteriks();
		
	}
	//Displays pyramid with asteriks
	public static void pyramid() {
		System.out.println("    *****    ");
		System.out.println("  *********  ");
		System.out.println("*************");
	}
	//Displays asteriks with vertical straight lines
	public static void straightLines() {
		System.out.println("* | | | | | *");
	}
	public static void fiveAsteriks() {
		System.out.println("    *****    ");
	}
	//Displays 13 asteriks in one line
	public static void thirteenAsteriks() {
		System.out.println("*************");
	}
	//Skips a line
	public static void lineSkip() {
		System.out.println();
	}
}