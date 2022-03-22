package com.training.cg1;

public class Employee {
	private String emp_id;
	private String emp_name;
	private String emp_dept;
	private double emp_salary;
	private int pfpercentage;
	private double pfamount;
	private double emp_allownce;
	private double emp_netsalary;
	Employee() {
		
	}
	Employee(Object obj) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_dept = emp_dept;
		this.emp_salary = emp_salary;
		this.pfpercentage= pfpercentage;
		this.pfamount = pfamount;
		this.emp_allownce = emp_allownce;
		this.emp_netsalary = emp_netsalary;
	}
	
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_dept() {
		return emp_dept;
	}
	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}
	public double getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
	public int getPfpercentage() {
		return pfpercentage;
	}
	public void setPfpercentage(int pfpercentage) {
		this.pfpercentage = pfpercentage;
	}
	public double getPfamount() {
		return pfamount;
	}
	public void setPfamount(double pfamount) {
		this.pfamount = pfamount;
	}
	public double getEmp_allownce() {
		return emp_allownce;
	}
	public void setEmp_allownce(double emp_allownce) {
		this.emp_allownce = emp_allownce;
	}
	public double getEmp_netsalary() {
		return emp_netsalary;
	}
	public void setEmp_netsalary(double emp_netsalary) {
		this.emp_netsalary = emp_netsalary;
	}	
	
	
	public void calculate() {
		double x = 0;
		pfamount = (getEmp_salary()*pfpercentage)/100;
		x = getEmp_salary()-pfamount-emp_allownce;
		setEmp_netsalary(x);
	}
	

}
