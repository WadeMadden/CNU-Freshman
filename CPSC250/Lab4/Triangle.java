package Lab4;

import java.awt.Point;

public class Triangle extends Shape {
	// Triangle Constructor
	public Triangle(Point[] points) {
		super("Triangle");
		Point[] newArray = new Point[3];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = points[i];
		}
		super.setPoints(newArray);
	}

	// calculates perimeter of triangle
	public double getPerimeter() {
		Point[] newArray = getPoints();
		Point point1 = newArray[0];
		Point point2 = newArray[1];
		Point point3 = newArray[2];

		double side1 = getDistance(point1, point2);
		double side2 = getDistance(point2, point3);
		double side3 = getDistance(point3, point1);
		double perimeter = side1 + side2 + side3;
		return perimeter;

	}

}
