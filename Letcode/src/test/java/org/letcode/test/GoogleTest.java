package org.letcode.test;


import org.letcode.seleniumbase.Browser;
import org.letcode.seleniumbase.SeleniumBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends SeleniumBase{
	
	
	@Test
	void letcodecall()
	{
		//setUp(  "https://www.google.com/");
		setUp(Browser.CHROME, "https://www.google.com/");
		
		WebElement ele =element("name","q");
		
		typeAndEnter(ele,"cricket",Keys.ENTER);
		
		quit();
		
		
	}

}
