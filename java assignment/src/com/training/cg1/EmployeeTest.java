package com.training.cg1;

import java.util.Scanner;

public class EmployeeTest extends Employee {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee details :");
		String id1 = sc.nextLine();
		String name1 = sc.nextLine();
		String dep1 = sc.nextLine();
		double sal1 = sc.nextDouble();
		double allow1 = sc.nextDouble();
		int pf1 = sc.nextInt();
		
		Employee e1 = new Employee();
		e1.setEmp_id(id1);
		e1.setEmp_name(name1);
		e1.setEmp_dept(dep1);
		e1.setEmp_salary(sal1);
		e1.setEmp_allownce(allow1);
		e1.setPfpercentage(pf1);
		
		e1.calculate();
		System.out.println("Employee Name: "+e1.getEmp_name());
		System.out.println("Employee pf amount is : "+e1.getPfamount());
		System.out.println("Employee Netsalary : "+e1.getEmp_netsalary());
	}

}
