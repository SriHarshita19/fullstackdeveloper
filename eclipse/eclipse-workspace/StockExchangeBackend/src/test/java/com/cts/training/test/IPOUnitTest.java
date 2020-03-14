package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.dao.IPODAO;
import com.cts.training.model.IPO;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class IPOUnitTest {

	
	private static AnnotationConfigApplicationContext context;
	private static IPODAO ipoDAO;
	private static IPO ipo;
	
	@BeforeClass
	public static void init() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		ipo=(IPO) context.getBean("ipo");
	
		ipoDAO=(IPODAO) context.getBean("ipoDAO");
	}
	
	@Test
	@Ignore
	public void testGetAllUsers() {
		List<IPO> users=ipoDAO.getAllIPOs();
		assertEquals(2,users.size());
	}
	
//	@Test(expected = NullPointerException.class)
//	public void test_update_user() {
//		IPO r=ipoDAO.getIPOById(1);
//		r.setCompanyName("CTS");
//		assertEquals(true,ipoDAO.updateIPO(r));
//	}
	
	@Test
	@Ignore
	public void test_add_user() {
		IPO re=new IPO(1,"Cognizant","NSE",988,544,"good");
		assertEquals(true,ipoDAO.addOrUpdateIPO(re));
	}
	
//	@Test(expected=IllegalArgumentException.class)
//	public void test_delete_user() {
//		IPO r=ipoDAO.getIPOById(1);
//		assertEquals(true,ipoDAO.deleteIPO(r));
//	}
	
//	@Test
//	public void test_get_id() {
//		IPO r=ipoDAO.getIPOById(55);
//		assertNotEquals("Google",r.getCompanyName());
//	}
	




	

}
