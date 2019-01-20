package Lab4;

import java.awt.Point;

public class Circle extends Shape {
	private double radius;

	// Circle constructor
	public Circle(Point center, double radius) {
		super("Circle");
		Point[] newCenter = { center };
		super.setPoints(newCenter);
		this.radius = radius;
		if (radius < 0) {
			this.radius = 0.0;
		}

	}

	// returns radius
	public double getRadius() {
		return this.radius;
	}

	// gets the perimeter of the circle
	@Override
	public double getPerimeter() {
		double perimeter = 2 * Math.PI * this.radius;
		return perimeter;
	}

}
