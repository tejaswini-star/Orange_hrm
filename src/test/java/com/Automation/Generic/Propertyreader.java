package com.Automation.Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyreader {
          static Properties prop= new Properties();
          public static void initProperty() {
	        try {
	        	prop.load(new FileInputStream("C:\\Users\\MOUNIKA\\eclipse-workspace\\Orange_hrm\\src\\test\\resources\\config\\config.properties"));
		
	             }
	        catch(Exception e) {
		e.printStackTrace();
	             }
       }
         public static String getProperty(String key) {
	        return prop.getProperty(key);
           } 
}
