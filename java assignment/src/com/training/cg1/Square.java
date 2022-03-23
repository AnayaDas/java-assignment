package com.training.cg1;

public class Square extends Shape implements Area{
	public double side;
	Square() {
		
	}
	Square(String n, double s) {
		this.name = n;
		this.side = s;
	}
	
	public double getArea() {
		double x;
		x = side*side;
		return x;
	}

}
