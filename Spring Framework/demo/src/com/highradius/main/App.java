package com.highradius.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.highradius.demo.Person;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Person person = (Person)context.getBean("p");
		
		System.out.println(person);
		
		context.registerShutdownHook();
	}
}
