package com.training.cg1;

public class BoxVolume extends Box {
	BoxVolume(Object obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		Box box = new Box(null);
		double Volume;
		Volume = box.volume();
		System.out.println("Volume of the box is: "+Volume);
		}

}
