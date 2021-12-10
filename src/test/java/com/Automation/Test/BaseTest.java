package com.Automation.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.Automation.Generic.Driverutils;
import com.Automation.Generic.Propertyreader;

public class BaseTest {
	@BeforeTest
	public void setUp()
	{
		Driverutils.createDriver();
		//Propertyreader.initProperty();
		//System.out.println("property created");
	}
/*AfterMethod
  public void cleanup()
 {
 DriverUtilis.getDriver().quit();
 }
 */
}
