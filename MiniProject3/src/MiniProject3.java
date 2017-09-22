/*Anthony Chaya
 * Mini Project 3
 * This program displays the message "Victory is mine!" 5 times*/
public class MiniProject3 {

	public static void main(String[] args) {
		topLine();
		victoryWithBottom();
		victoryWithBottom();
		victoryWithBottom();
		victoryWithBottom();
		victoryWithBottom();

	}
	//This method prints out the top line of forward slashes
	public static void topLine() {
		System.out.println("//////////////////////");
	}
	//This method prints out the line Victory is mine! with the bottom forward slashes
	public static void victoryWithBottom() {
		System.out.println("|| Victory is mine! ||\n//////////////////////");
	}
}
