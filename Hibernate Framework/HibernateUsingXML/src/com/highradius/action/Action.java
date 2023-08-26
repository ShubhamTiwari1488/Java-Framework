package com.highradius.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.highradius.pojo.Address;
import com.highradius.pojo.Person;

public class Action {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		System.out.println(factory);
		System.out.println(factory.isClosed());
		
		
		Person person = new Person();
		Address address = new Address();
		
		person.setPid(192);
		person.setPname("Rishi Dada");
		
		address.setStreet("Street");
		address.setCity("Jamshedpur");
		address.setCountry("India");
		
//		person.setAddress(address);
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(person);
		session.save(address);
		
		transaction.commit();
		
		session.close();
		factory.close();
		
		System.out.println("\nTask Completed\n");
	}
}
