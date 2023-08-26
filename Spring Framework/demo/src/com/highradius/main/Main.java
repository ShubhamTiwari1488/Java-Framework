package com.highradius.main;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.highradius.demo.Employee;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Employee employee = (Employee)context.getBean("emp");
		
		//init() will be called by the spring container
		
		System.out.println(employee);	//toString method is called
		
		context.registerShutdownHook();	//destroy() method will be called by spring container
		
		
		System.out.println("\n\nPrinting another object\n");
		
		employee = (Employee)context.getBean("empConstructor");
		
		System.out.println(employee);
		
		context.registerShutdownHook();
	}
}
