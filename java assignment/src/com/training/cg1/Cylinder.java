package com.training.cg1;

public class Cylinder extends Circle implements Volume {
	
	public double height;
	Cylinder(String n, double r, double h) {
		this.name = n;
		this.radius= r;
		this.height = h;
		
	}
	
	public double getVolume() {
		double x;
		x = 3.14*(radius*radius)*height;
		return x;
	}

}
