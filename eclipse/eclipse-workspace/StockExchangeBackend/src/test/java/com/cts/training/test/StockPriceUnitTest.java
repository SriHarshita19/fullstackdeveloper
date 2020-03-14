package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.dao.StockPriceDAO;
import com.cts.training.model.StockExchange;
import com.cts.training.model.StockPrice;

public class StockPriceUnitTest {
	private static  AnnotationConfigApplicationContext context;
	@Autowired
	
	private static StockPriceDAO stockPriceDAO;
	private static StockPrice stockPrice;
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		stockPrice =(StockPrice) context.getBean("stockPrice");
		stockPriceDAO =(StockPriceDAO)context.getBean("stockPriceDAO");
	}
	@Test
	
	public void testGetAllStockPrices() {
		List<StockPrice> stockPrices=stockPriceDAO.displayAllStockPrices();
		assertEquals(0,stockPrices.size());
	
	}
	
	@Test
	@Ignore
	public void test_saveOrUpdate_stockPrices_success() {
		StockExchange stockExchange=new StockExchange();
		System.out.println(stockExchange);
		assertEquals(true,stockPriceDAO.saveorUpdateStockPrice(stockPrice));
	}
	

}
