package com.training.cg1;

public class Circle extends Shape implements Area {

	public double radius;
	Circle(){
	
	}
	Circle(String n, double r) {
		this.name= n;
		this.radius = r;
	}
	
	public double getArea() {
		double x;
		x = (3.14*radius*radius);
		return x;
	}

		

}
