package com.training.cg1;

public class BoxVolume extends Box {
	public static void main(String args[]) {
		Box box = new Box();
		double Volume;
		Volume = box.volume();
		System.out.println("Volume of the box is: "+Volume);
		}

}
