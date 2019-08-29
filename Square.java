package com.revature.shapes;

public class Square extends Shapes implements Rectangle {

	public Square(int side1, int side2) {
		super("square", side1, side2);
	}

	public void isRectangle() {
		System.out.println("I am a rectangle too!");
	}
	
	public String getName(Boolean value) {
		if (value)
			return "[" + super.getName() + "," + super.getSide1() + "," + super.getSide2() + "]";
		return super.getName();
	}

}
