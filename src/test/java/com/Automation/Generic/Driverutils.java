package com.Automation.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverutils {
    static WebDriver driver; 
    public static void createDriver()
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\MOUNIKA\\eclipse-workspace\\Orange_hrm\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/saveSystemUser");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public static WebDriver getDriver()
    {
    	if(driver==null)
    	{
    		createDriver();
    	}
    	return driver;
    }
}
