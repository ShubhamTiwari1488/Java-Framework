package com.highradius.demo;

public class Employee {
	private String name;
	private int empid;
	private double salary;
	
	
	public Employee() {
		super();
	}
	
	public Employee(String name, int empid, double salary) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Name is set");
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		System.out.println("Empid is set");
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		System.out.println("Salary is set");
		this.salary = salary;
	}
	@Override
	public String toString() {
		System.out.println("Overriding the toString method");
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	
	public void init() {
		System.out.println("In the init method");
	}
	
	public void destroy() {
		System.out.println("In the destroy method of : "+ name);
	}
}
