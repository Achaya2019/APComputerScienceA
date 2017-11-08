/* Anthony Chaya
 * Mini Project 2
 * This progam will display six lines of text and one empty line in between the 6 text lines*/
public class MiniProject2 {

	public static void main(String[] args) {
		part1();
		emptyLine();
		part2();

	}
	//This method prints out part 1 of the 6 line statement
	public static void part1() {
		System.out.println("A well-formed Java program has\na main method with { and }\nbraces.");
	}
	//This method prints out an empty line
	public static void emptyLine() {
		System.out.println();
	}
	//This method prints out part 2 of the 6 line statement
	public static void part2() {
		System.out.println("A System.out.println statement\nhas ( and ) and usually a\nString enclosed between \" and \"");
	}
}
