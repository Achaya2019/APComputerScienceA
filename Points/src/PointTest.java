/*Anthony Chaya
 * Point Test
 */
public class PointTest {

	public static void main(String[] args) {
		//tests
		Point p1 = new Point(1, 2);
		Point p2 = new Point(); 	 //Origin, (0.0, 0.0)
		
		System.out.println(p1.getX() + " " + p1.getY());
		p1.setLocation(3, 4);
		System.out.println(p1.getX() + " " + p1.getY());
		p1.translate(2, 2);
		System.out.println(p1.getX() + " " + p1.getY());
		
	}

}
