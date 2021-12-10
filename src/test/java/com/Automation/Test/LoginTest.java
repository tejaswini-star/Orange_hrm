package com.Automation.Test;
import org.testng.annotations.Test;

import com.Automation.Generic.Propertyreader;
import com.Automation.Pages.Adminpage;
import com.Automation.Pages.LoginPage;

/*
public class LoginTest extends BaseTest {
	LoginPage a=new LoginPage();
	Adminpage a1=new Adminpage();
	@Test
        public void VerifyLogin() throws InterruptedException
    	{
		a.openUrl();
		Thread.sleep(3000);
		a.enterusername("Admin");
		Thread.sleep(3000);
		a.enterpassword("admin123");
		Thread.sleep(3000);
		a.clicklogin();
		}	
	@Test(priority=1)
	public void VerifyAddUser()
	{
		 a1.Action();
		 a1.SelectRole();
		 a1.enterEname("sravani mallikarjun");
		 a1.enterUname("Tejaswini");
		 a1.SelectStatus();
		 a1.enterPwd("Teju@9121");
		 a1.enterCPwd("Teju@9121");
		 a1.clickSave();
	}
	}
	*/
//by using property reader
public class LoginTest extends BaseTest {
	LoginPage a=new LoginPage();
	Adminpage a1=new Adminpage();
	@Test
        public void VerifyLogin() throws InterruptedException
    	{
		a.openUrl();
		//Thread.sleep(3000);
		Propertyreader.initProperty();
		a.enterusername(Propertyreader.getProperty("login.username"));
		//Thread.sleep(3000);
		a.enterpassword(Propertyreader.getProperty("login.password"));
		//Thread.sleep(3000);
		a.clicklogin();
		}	
	@Test(priority=1)
	public void VerifyAddUser()
	{
		 a1.Action();
		 a1.SelectRole();
		 Propertyreader.initProperty();
		 a1.enterEname(Propertyreader.getProperty("admin.ename"));
		 a1.enterUname(Propertyreader.getProperty("admin.uname"));
		 a1.SelectStatus();
		 a1.enterPwd(Propertyreader.getProperty("admin.pwd"));
		 a1.enterCPwd(Propertyreader.getProperty("admin.cpwd"));
		 a1.clickSave();
	}
	}
	