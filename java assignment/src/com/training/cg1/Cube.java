package com.training.cg1;

public class Cube extends Square implements Volume {

	Cube(String n, double s) {
		this.name = n;
		this.side = s;
	}
	
	public double getVolume() {
		double x;
		x = side*side*side;
		return x;
	}
	

}
