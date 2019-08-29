package com.revature.shapes;

public abstract class Shapes {
	private String name;
	private int side1;
	private int side2;
	
	public Shapes() {}
	
	public Shapes(String n, int s1, int s2) {
		name = n;
		side1 = s1;
		side2 = s2;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSide1() {
		return side1;
	}
	
	public int getSide2() {
		return side2;
	}
	
	public int area() {
		return side1 * side2;
	}
	
	public void draw() {
		System.out.println(name);
	}
	
	public String toString() {
		return "I am a " + name + " with sides: [" + side1 + "," + side2 + "]";
	}

}
