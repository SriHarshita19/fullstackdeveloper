package com.cts.training.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.Company;
import com.cts.training.model.StockExchange;

public class CompanyController {
private static Company getCompany;

public static void main(String args[]) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	Session session=sessionFactory.openSession();
	Transaction transaction=session.beginTransaction();
//	Company company=new Company(2,"reliance","Digital Transaformation","ambani",736466.747);
//	session.save(company);
	StockExchange se=new StockExchange(1,"BSE","mumbai","mutual funds");
	session .save(se);
	transaction.commit();
	session.close();
}
}
