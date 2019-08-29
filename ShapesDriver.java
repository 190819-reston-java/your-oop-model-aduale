package com.revature.shapes;

public class ShapesDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square mySquare = new Square(4, 4);
		System.out.println(mySquare.toString());
		
		Triangle myTriangle = new Triangle(5,5);
		System.out.println(myTriangle.toString());
		
		System.out.println(myTriangle.area());
		
	}
	

}
