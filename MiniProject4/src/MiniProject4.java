/* Anthony Chaya
 * Mini Project 4
 * This program displays a rocket ship with the text Hello World in it*/
public class MiniProject4 {

	public static void main(String[] args) {
		topBottomRocket();
		topBottomMid();
		helloWorldMid();
		topBottomMid();
		topBottomRocket();
	}
	//This method displays the top of the rocket
	public static void topBottomRocket() {
		System.out.println("     /\\   ");
		System.out.println("    /  \\  ");
		System.out.println("   /    \\ ");
	}
	//This method displays the top mid and bottom mid boxes of the rocket
	public static void topBottomMid() {
		System.out.println("  +------+ ");
		System.out.println("  |      | ");
		System.out.println("  |      | ");
		System.out.println("  +------+ ");
	}
	//This method displays Hello World in the middle box of the rocket
	public static void helloWorldMid() {
		System.out.println("  |Hello | ");
		System.out.println("  | World| ");
	}
	
}
