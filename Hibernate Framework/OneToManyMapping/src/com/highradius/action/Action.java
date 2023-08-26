package com.highradius.action;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.highradius.pojo.Answers;
import com.highradius.pojo.Question;

public class Action {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		System.out.println(factory);
		System.out.println(factory.isClosed());
		
		System.out.println("Beginning \n");
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Question question = new Question();
		Answers answers = new Answers();
		Answers answers2 = new Answers();
		
		question.setQid(111);
		question.setQues("What is Java?");
		
		answers.setAid(234);
		answers.setAns("Java is a programming Language");
		answers.setQuestion(question);
		
		answers2.setAid(443);
		answers2.setAns("Java has many frameworks");
		answers2.setQuestion(question);
		
		List<Answers> answers3 = new ArrayList<>();
		
		answers3.add(answers2);
		answers3.add(answers);
		
		question.setAnswers(answers3);
		
		session.save(question);
		session.save(answers);
		session.save(answers2);
		
		transaction.commit();
		
		session.close();
		factory.close();
	}
}
