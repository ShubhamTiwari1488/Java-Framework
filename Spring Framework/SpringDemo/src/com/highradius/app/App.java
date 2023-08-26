package com.highradius.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.highradius.person.Person;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Person person = (Person)context.getBean("person");
		
		System.out.println(person);
	}
}
