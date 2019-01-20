package Lab4;

import java.awt.Point;

public class Quadrilateral extends Shape {
	// Quad constructor
	public Quadrilateral(Point[] points) {
		super("Quadrilateral");
		Point[] newArray = new Point[4];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = points[i];
		}
		super.setPoints(newArray);
	}

	// calculates the perimeter of the quad
	public double getPerimeter() {
		Point[] newArray = getPoints();
		Point point1 = newArray[0];
		Point point2 = newArray[1];
		Point point3 = newArray[2];
		Point point4 = newArray[3];
		double side1 = getDistance(point1, point2);
		double side2 = getDistance(point2, point3);
		double side3 = getDistance(point3, point4);
		double side4 = getDistance(point4, point1);
		double perimeter = side1 + side2 + side3 + side4;
		return perimeter;

	}
}
