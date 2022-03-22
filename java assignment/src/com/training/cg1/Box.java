package com.training.cg1;

public class Box {
	double length;
	double breadth;
	double height;
	
	Box() {
		length = 100;
		breadth = 50;
		height = 50;
	}
	
	double volume() {
		return length*breadth*height;
	}

}
