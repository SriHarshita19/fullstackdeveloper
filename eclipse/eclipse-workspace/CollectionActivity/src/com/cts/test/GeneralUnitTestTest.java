package com.cts.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class GeneralUnitTestTest {
	static GeneralAPI api=null;
	@BeforeClass
	public  static void start()
	{
		api=new GeneralAPI();
		System.out.println("general api object created");
	}
	@AfterClass
	public static void destroy()
	{
		api=null;
		System.out.println("api object destroyed");
	}

	@Ignore
	@Test
	public void testAddNumbers() {
	   assertEquals(12,api.add(4, 8));
	}
	@Test
	public void testCheckForEven() {
		   assertEquals(true,api.add(4, 8));
		}
	public void testFactorialNumber()
	{
		assertEquals(6,api.getFactorial(6));
	}
	
	public void primeNumber()
	{
		
	}

}
