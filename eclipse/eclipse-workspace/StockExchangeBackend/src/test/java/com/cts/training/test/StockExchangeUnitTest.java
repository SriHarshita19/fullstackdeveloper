package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.model.StockExchange;

public class StockExchangeUnitTest {
	private static  AnnotationConfigApplicationContext context;
	@Autowired
	
	private static StockExchangeDAO stockExchangeDAO;
	private static StockExchange stockExchange;
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		stockExchange =(StockExchange) context.getBean("stockExchange");
		stockExchangeDAO =(StockExchangeDAO)context.getBean("stockExchangeDAO");
	}
	@Test
	@Ignore
	public void testGetAllStockExchanges() {
		List<StockExchange> stockExchanges=stockExchangeDAO.getAllStockExchanges();
		assertEquals(0,stockExchanges.size());
	
	}
	
	@Test
	
	public void test_saveOrUpdate_stockExchange_success() {
		StockExchange stockExchange=new StockExchange(1,"stockexchange","contact address","brief");
		System.out.println(stockExchange);
		assertEquals(true,stockExchangeDAO.saveOrUpdateStockExchange(stockExchange));
	}
	

}
