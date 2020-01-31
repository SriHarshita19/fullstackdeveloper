package com.cts.training.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.User;

public class UserController {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		User user = new User(104, "harshi", "harshi@123", "harshi@cts.com", 7556555L, true);
		
		session.save(user);
		User getUser=session.get(User.class,104);
//		getUser.setEnabled(true);
//		getUser.setPassword("665566");
//		session.update(getUser);
//		List<User>users=session.createQuery("FROM User").list();
//		users.forEach(System.out::println);
		transaction.commit();
		session.close();

	}

}
