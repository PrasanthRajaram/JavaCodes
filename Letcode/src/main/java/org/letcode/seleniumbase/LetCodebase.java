package org.letcode.seleniumbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LetCodebase {
	
	
	 protected  ChromeDriver driver = null;

@BeforeMethod 	
public void startapp()
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://letcode.in/signin");
	System.out.println("start");
	
	}
@AfterMethod
public void closeapp()
{
	driver.quit();
	System.out.println("end");
}


}
