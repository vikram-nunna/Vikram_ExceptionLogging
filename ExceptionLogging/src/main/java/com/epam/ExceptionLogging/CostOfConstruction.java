package com.epam.ExceptionLogging;

import org.apache.logging.log4j.LogManager;

public class CostOfConstruction {

	private static final org.apache.logging.log4j.Logger VikramLogg =LogManager.getLogger(CostOfConstruction.class);
	double calculateCost(int standard,double areaOfHouse,boolean automated)
	{
		double costOfHouse=0;
		if(standard==1)
		{
			costOfHouse+=(1200*areaOfHouse);
			VikramLogg.info(costOfHouse);
			VikramLogg.error("Error Occurred Due to Exception");
			VikramLogg.warn("Wrong Code Warning");
			VikramLogg.fatal("In Case Aborted");
		}
		else if(standard==2)
		{
			costOfHouse+=(1500*areaOfHouse);
			VikramLogg.info(costOfHouse);
			VikramLogg.error("Error Occurred Due to Exception");
			VikramLogg.warn("Wrong Code Warning");
			VikramLogg.fatal("In Case Aborted");
		}
		else if(standard==3 && automated==false)
		{
			costOfHouse+=(1800*areaOfHouse);
			VikramLogg.info(costOfHouse);
			VikramLogg.error("Error Occurred Due to Exception");
			VikramLogg.warn("Wrong Code Warning");
			VikramLogg.fatal("In Case Aborted");
		}
		else if(standard==3 && automated==true)
		{
			costOfHouse+=(2500*areaOfHouse);
			VikramLogg.info(costOfHouse);
			VikramLogg.error("Error Occurred Due to Exception");
			VikramLogg.warn("Wrong Code Warning");
			VikramLogg.fatal("In Case Aborted");
		}		
		return(costOfHouse);	
	}
}
