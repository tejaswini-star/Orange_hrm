package com.Automation.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage extends BasePage{
	@FindBy(id="txtUsername") 
	private WebElement unTB;
	@FindBy(id="txtPassword")
	private WebElement pwTB;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnlogin;
	public void openUrl()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/saveSystemUser");
	}
	
	public void enterusername(String un)
	{
		unTB.sendKeys(un);
	}
	public void enterpassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clicklogin()
	{
		btnlogin.click();
	}

}
