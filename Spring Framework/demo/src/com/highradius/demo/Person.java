package com.highradius.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author KIIT
 *
 */
public class Person implements InitializingBean,DisposableBean{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public void destroy() throws Exception {
		//destroy method
		System.out.println("Person is destroyed!!!");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		//init() method
		System.out.println("Person is initialized!!!");
	}
}
