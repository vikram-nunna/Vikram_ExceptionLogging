package com.epam.ExceptionLogging;

import junit.framework.TestCase;

public class CostOfConstructionTest extends TestCase {

	CostOfConstruction cost=new CostOfConstruction();
	public void testCalculateCost() {
		assertEquals(750000.0,cost.calculateCost(2, 500, true),0);
		assertEquals(405000.0,cost.calculateCost(3, 225, false),0);
		assertEquals(150000.0,cost.calculateCost(2, 100, true),0);
	}

}
