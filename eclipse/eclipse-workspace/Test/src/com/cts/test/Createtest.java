package com.cts.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Createtest {
	    static Calculator calculator;
	     @BeforeClass
	     public static void init() {
	    	 calculator=new Calculator();
	    	 System.out.println("Calculator object created");
	     }
	     @AfterClass
	     public static void destroy() {
	    	 calculator=null;
	    	 System.out.println("Calculator object destroyed");
	}
	     @Test
	     public void testMulNumbers() {
	    	 assertEquals(6,calculator.mul(2,3));
	     }
	     @Test
	     public void testDivNumbers() {
	    	 assertEquals(2,calculator.(2,4));
	     }
	}
