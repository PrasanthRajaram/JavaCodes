package org.letcode.test;

import org.letcode.pages.LoginPage;
import org.letcode.seleniumbase.LetCodebase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test0001L extends LetCodebase{

	@Test
	public void Logintest()
	{
		
	LoginPage lp = new LoginPage(driver);
	
	boolean enterEmail = lp.getEmailLabel();
	Assert.assertTrue(enterEmail);
	
	boolean enterPassword = lp.getPasswordLabel();
	Assert.assertTrue(enterPassword);
	
		
		
		
	new LoginPage(driver).enterEmail("koushik350@gmail.com").enterPassword("Pass123$").clickLogin();
	
	
	
	
	}	


}
