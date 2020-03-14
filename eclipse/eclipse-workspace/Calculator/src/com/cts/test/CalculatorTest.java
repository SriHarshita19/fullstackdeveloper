package com.cts.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.main.Calculator;

public class CalculatorTest {
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
     public void testAddNumbers() {
    	 assertEquals(5,calculator.add(2,3));
     }
     @Test
     public void testSubNumbers() {
    	 assertEquals(-1,calculator.sub(2,3));
     }
}
