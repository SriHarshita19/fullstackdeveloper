package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.dao.SectorDAO;
import com.cts.training.model.Sector;



public class SectorUnitTest {

	private static AnnotationConfigApplicationContext context;
	private static SectorDAO sectorDAO;
	private static Sector sector;
	
	@BeforeClass
	public static void init() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		sector=(Sector) context.getBean("sector");
	
		sectorDAO=(SectorDAO) context.getBean("sectorDAO");
	}
	
	@Test
	@Ignore
	public void testGetAllUsers() {
		List<Sector> users=sectorDAO.getAllSectors();
		assertEquals(3,users.size());
	}
	
//	@Test(expected = NullPointerException.class)
//	@Ignore
//	public void test_update_user() {
//		Sector r=sectorDAO.getSectorById(1);
//		r.setName("CTS");
//		assertEquals(true,sectorDAO.updateSector(r));
//	}
//	
//	@Test
//	@Ignore
//	public void test_add_user() {
//		Sector re=new Sector(4,"IT","developed");
//		assertEquals(true,sectorDAO.addSector(re));
//	}
//	
//	@Test(expected=IllegalArgumentException.class)
//	public void test_delete_user() {
//		Sector r=sectorDAO.getSectorById(1);
//		assertEquals(true,sectorDAO.deleteSector(r));
//	}
//	
//	@Test
//	@Ignore
//	public void test_get_id() {
//		Sector r=sectorDAO.getSectorById(55);
//		assertNotEquals("CSE",r.getName());
//	}

}
