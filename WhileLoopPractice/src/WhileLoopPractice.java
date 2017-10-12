
public class WhileLoopPractice {

	public static void main(String[] args) {
		int liftoffCntr=10;
		int oddCntr = 1;
		int stars = 5;
		//loop to print liftoff sequence
		while (liftoffCntr>=1) {
			System.out.print(liftoffCntr + "...");
			liftoffCntr--;
			}
		System.out.println("Liftoff!");
		
		//loop to print odd numbers from 1 to 100
		while (oddCntr < 100) {
			if (oddCntr%2 != 0) {
				System.out.println(oddCntr);
			}
			oddCntr++;
		}
		stars(stars);


	}
		public static void stars(int stars) {
			while (stars > 0) {
				System.out.print("*");
			stars--;
			}
			
		}
}

