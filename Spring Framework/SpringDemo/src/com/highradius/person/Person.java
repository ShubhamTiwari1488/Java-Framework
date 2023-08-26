package com.highradius.person;

public class Person {
	private String fname;
	private int age;
	private String sex;
	
//	public Person(String fname, int age, String sex) {
//		super();
//		this.fname = fname;
//		this.age = age;
//		this.sex = sex;
//	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [fname=" + fname + ", age=" + age + ", sex=" + sex + "]";
	}
	
	public void init() {
		System.out.println("We are in the init method!!");
	}
	
	public void destroy() {
		System.out.println("We are in the destroy method!!");
	}
	
}
