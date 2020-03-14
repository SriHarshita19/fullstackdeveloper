package com.cts.training.controller;

import org.hibernate.cfg.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.impl.CompanyDAOImpl;
import com.cts.training.model.Company;


public class CompanyController {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Company company = new Company(1, "CTS", "Digital ", "Brain", "Tanu", 26537653L);
		
		CompanyDAO companyDAO = new CompanyDAOImpl();
		
		// creating table
//		boolean status = companyDAO.saveCompany(company);
//		if (status) {
//			System.out.println("user Saved Successfully");
//		} else {
//			System.out.println("Try Again");
//		}
		
		// updating company
//		Company getCompany=companyDAO.getCompanyById(1);
//		getCompany.setBod("Abhi");		
//		
//		boolean status = companyDAO.updateCompany(company);
//		if (status) {
//				System.out.println("Updated successfully");
//		}else {
//			System.out.println("Try Again");
//		}
		
		//deleting company
		
//		Company getCompany=companyDAO.getCompanyById(1);
//		boolean status = companyDAO.deleteCompany(getCompany);
//		if(status) {
//			System.out.println("Deleted successfully");
//		}else {
//			System.out.println("Try Again");
//		}
		
		List<Company> getCompany= companyDAO.getAllCompany();
		getCompany.forEach(System.out::println);
		

		transaction.commit();
		session.close();
		
	}

}
