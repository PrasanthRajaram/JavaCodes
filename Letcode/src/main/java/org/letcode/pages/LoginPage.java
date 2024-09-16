package org.letcode.pages;

import java.sql.Driver;

import org.letcode.seleniumbase.LetCodebase;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage extends LetCodebase {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	
	
	public boolean getEmailLabel()
	{
		System.out.println("yes done 1");
		return driver.findElementByXPath("//label[@class='label'][1]").isDisplayed();
		
	}
	
	public boolean getPasswordLabel()
	
	{
		System.out.println("yes done 2");
		return driver.findElementByXPath("(//label[@class='label'])[2]").isDisplayed();
	}
	
	
	
	/**
	 * @description - get the name from user and type on the email field
	 * @param email - pass the user to login
	 * @return 
	 */
	
	public LoginPage enterEmail(String username)
	{
	driver.findElementByName("email").sendKeys(username);
	return this;
	}
	
	public LoginPage enterPassword(String password)
	{
		driver.findElementByName("password").sendKeys(password);
		return this;
	}	
	

	public DashboardPage clickLogin()
	{
		driver.findElementByXPath("//button[.='LOGIN']").click();
		return new DashboardPage();
	}


}
