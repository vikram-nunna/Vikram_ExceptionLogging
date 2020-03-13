package com.epam.ExceptionLogging;

import junit.framework.TestCase;

public class SimpleAndCompoundTest extends TestCase {

	SimpleAndCompound calculate=new SimpleAndCompound();
	public void testSimpleIntrest() {
		assertEquals(100.0, calculate.simpleIntrest(100, 1, 0));
		assertEquals(1060.0,calculate.simpleIntrest(1000.0,3.0,2.0),0);
	}

	public void testCompoundIntrest() {
		assertEquals(24.0, calculate.compoundIntrest(1200, 1, 2));
	}

}
