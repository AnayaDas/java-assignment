package com.training.cg1;

public class Glome extends Sphere implements Volume {
	Glome(String n, double r) {
		super(n, r);
		// TODO Auto-generated constructor stub
	}

	public double getVolume() {
		double x;
		x = 2*3.14*3.14*radius*radius*radius;
		return x;
	}

}
