package Lab4;

import java.awt.Point;

public abstract class Shape {
	private String name;
	private Point[] points;

	// default constructor
	protected Shape() {
	};

	// constructor with parameter name
	protected Shape(String aName) {
		this.name = aName;
	}

	// access method for name
	public final String getName() {
		return name;
	}

	// mutator for setting points
	protected final void setPoints(Point[] thePoints) {
		this.points = thePoints;
	}

	// access points array
	public final Point[] getPoints() {
		return points;
	}

	// satisfies classes lower in the hierarchy and demands a getPerimeter
	// method
	public abstract double getPerimeter();

	// calculates the distance between two points
	public static double getDistance(Point one, Point two) {
		double oneX = one.getX();
		double oneY = one.getY();
		double twoX = two.getX();
		double twoY = two.getY();

		double xVar = Math.abs(oneX - twoX);
		double yVar = Math.abs(oneY - twoY);

		double xSqu = Math.pow(xVar, 2);
		double ySqu = Math.pow(yVar, 2);
		double total = xSqu + ySqu;
		double distance = Math.sqrt(total);
		return distance;
	}
}