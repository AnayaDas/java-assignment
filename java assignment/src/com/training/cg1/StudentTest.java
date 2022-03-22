package com.training.cg1;

public class StudentTest extends Student {
	StudentTest(String name, int roll_no, int total_marks) {
		super(name, roll_no, total_marks);
		// TODO Auto-generated constructor stub
	}
	public boolean isEqual(Object obj) {
		if(this == obj) {
			return true;
		}
		if (obj instanceof Student) {
			Student stud = (Student) obj;
			return((stud.name.equals(this.name)));
		}
		return false;
	}

	public static void main(String args[]) {
		Student s1 = new Student ("John",10,87);
		Student s2 = new Student ("Maria",25,99);
		System.out.println(s1.equals(s2));
	
	}

}
