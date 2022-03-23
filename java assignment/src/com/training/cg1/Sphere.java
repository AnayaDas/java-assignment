package com.training.cg1;

public class Sphere extends Circle implements Volume {
	Sphere(String n, double r) {
		this.name = n;
		this.radius = r;
	}

	public double getVolume() {
		double x;
		x = (4/3)*3.14*radius*radius*radius;
		return x;
	}
}
