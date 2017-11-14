
public class Point {
	private double x;
	private double y;
	
	//constructor
	public Point(double newX, double newY) {
		x = newX;
		y = newY;
	}
	//constructor for origin
	public Point() {
		x = 0;
		y = 0;
	}
	
	//Accessor for x
	public double getX() {
		return x;
	}
	
	//Accessor for y
	public double getY() {
		return y;
	}
	
	//Mutator for x
	public void setX(double stX) {
		x = stX;
	}
	
	//Mutator for y
	public void setY(double stY) {
		y = stY;
	}
	//sets a new location to a point 
	public void setLocation(double locX, double locY) {
		x = locX;
		y = locY;
	}
	//changes the points in a declared point by the inputted numbers
	public void translate(double dx, double dy) {
		x += dx;
		y += dy;
	}
	//calculates the distance between the points given and the predefined points
	public double getDistance(double p2) {
		double p;
		p = p2;
		return p;
		
	}
	
}
