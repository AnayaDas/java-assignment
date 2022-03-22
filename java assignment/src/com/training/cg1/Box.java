package com.training.cg1;

public class Box {
	double length;
	double breadth;
	double height;
	
	Box(Object obj) {
		length = 100;
		breadth = 50;
		height = 50;
	}
	
	double volume() {
		return length*breadth*height;
	}

}
