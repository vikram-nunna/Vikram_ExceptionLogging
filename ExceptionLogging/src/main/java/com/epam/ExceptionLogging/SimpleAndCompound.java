package com.epam.ExceptionLogging;

import org.apache.logging.log4j.LogManager;


public class SimpleAndCompound {

	private static final org.apache.logging.log4j.Logger VikramLogg =LogManager.getLogger(SimpleAndCompound.class);
	public double simpleIntrest(double principle,double time,double rate)
	{
		double amount=(double)((principle*time*rate)/100);
		VikramLogg.info(amount+principle);
		VikramLogg.error("Error Occurred Due to Exception");
		VikramLogg.warn("Wrong Code Warning");
		VikramLogg.fatal("In Case Aborted");
		return amount+principle;
	}
	public double compoundIntrest(double principle,double time,double rate)
	{
		double amount=(double)(principle*(Math.pow((1+(rate/100)), time)));
		amount=amount-principle;
		VikramLogg.info(amount);
		VikramLogg.error("Error Occurred Due to Exception");
		VikramLogg.warn("Wrong Code Warning");
		VikramLogg.fatal("In Case Aborted");
		return amount;
	}
}
