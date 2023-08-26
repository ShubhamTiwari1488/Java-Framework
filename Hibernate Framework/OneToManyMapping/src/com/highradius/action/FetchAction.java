package com.highradius.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.highradius.pojo.Answers;
import com.highradius.pojo.Question;

public class FetchAction {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		System.out.println("Fetching of data will begin !!\n");
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Question question = (Question)session.get(Question.class, 111);
		Answers answers = (Answers)session.get(Answers.class, 234);
		
		System.out.println(question.getQid()+"\t"+question.getQues()+"\n"+question.getAnswers());
		System.out.println("\n");
		System.out.println(answers.getAid()+"\t"+answers.getAns()+"\n"+answers.getQuestion());
		
		session.close();
		factory.close();
	}
}
