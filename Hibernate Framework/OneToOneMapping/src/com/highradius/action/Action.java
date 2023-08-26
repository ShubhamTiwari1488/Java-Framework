package com.highradius.action;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.highradius.pojo.Answer;
import com.highradius.pojo.Question;

public class Action {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		Question ques = new Question();
		
		ques.setQid(101);
		ques.setQues("What is your name");
		
		Answer answer = new Answer();
		answer.setAid(202);
		answer.setAns("My name is Shubham Tiwari");
		
		ques.setAnswer(answer);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(answer);
		session.save(ques);
		
		transaction.commit();
		
		session.close();
		factory.close();
	}
}
