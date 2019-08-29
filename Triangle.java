package com.revature.shapes;

public class Triangle extends Shapes {

	public Triangle(int side1, int side2) {
		super("triangle", side1, side2);
	}
	
	public int area() {
		return (int) (0.5 * super.area());
	}
	
}
