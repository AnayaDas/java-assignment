package com.training.cg1;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius :");
		double radius = sc.nextDouble();
		
		System.out.println("Enter the side :");
		double side = sc.nextDouble();

		System.out.println("Enter the height :");
		double height = sc.nextDouble();
		
		Shape c = new Circle("Circle", radius);
		double c1 =  ((Circle) c).getArea();
		System.out.println("Area of the circle is: "+c1);
		
		
		Shape s = new Square("Square",side);
		double s1 = ((Square) s).getArea();
		System.out.println("Area of the square is: "+s1);
			
		
		Shape cy = new Cylinder("Cylinder",radius,height);
		double cy1 = ((Cylinder) cy).getVolume();
		System.out.println("Volume of the cylinder is: "+cy1);

		
		Shape sp = new Sphere("Sphere", radius);
		double sp1 = ((Sphere) sp).getVolume();
		System.out.println("Volume of the sphere is: "+sp1);
		
		
		Shape cu = new Cube("Cube",side);
		double cu1 = ((Cube) cu).getVolume();
		System.out.println("Volume of the cube is: "+cu1);
		
		
		Shape g = new Glome("Glome",radius);
		double g1 = ((Glome) g).getVolume();
		System.out.println("Volume of the glome is: "+g1);

		
	}

}
