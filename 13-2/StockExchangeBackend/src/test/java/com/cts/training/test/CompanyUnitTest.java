package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.dao.CompanyDAO;

import com.cts.training.model.Company;


public class CompanyUnitTest {

	private static  AnnotationConfigApplicationContext context;
	@Autowired
	private static CompanyDAO companyDAO;
	private static Company company;
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		company =(Company) context.getBean("company");
		companyDAO =(CompanyDAO)context.getBean("companyDAO");
	}
	@Test
	
	public void testGetAllCompanies() {
		List<Company> companies=companyDAO.getAllCompanies();
		assertEquals(3,companies.size());
	
	}
	@Test
	@Ignore
	public void test_update_company_success()
	{
		Company c=companyDAO.getCompanyById(3);
		
		assertEquals(true,companyDAO.saveOrUpdateCompany(c));
	}
	
	@Test
    @Ignore
	public void test_delete_company()
	{
		Company c=companyDAO.getCompanyById(1);
		assertEquals(true,companyDAO.deleteCompany(c));
		
	}
	
	
}	


