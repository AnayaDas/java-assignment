package com.training.cg1;

import org.w3c.dom.ranges.RangeException;

	public class StudentExaminationDemo {
		public static void main(String[] args) {
			
			StudentExamination stud = new StudentExamination(args[0]);
			if (args.length>7) {
				System.out.println("invalid subject");
			}
			
			double[] marks = new double[6];
			for(int i=0;i<6;i++) {
				try {
					marks[i] = Double.parseDouble(args[i+1]);
				}
				catch(Exception e) {
					System.out.println("Invalid Argument has been encountered");
					e.printStackTrace();
				}
			}
			try {
				stud.setMarks(marks);
			}
			catch(RangeException e) {
				System.out.println(e.getMessage());
			}
			
			stud.getInfo();
			
		}
	}


	
