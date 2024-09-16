package testNGbasic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountInterview {

	@Test(invocationCount = 3,invocationTimeOut = 30000)
	public void cricket() {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.cricbuzz.com/");
         
      List<WebElement> cricket =    driver.findElementsByXPath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]");
      
      System.out.println(cricket.size());
         
         driver.quit();    
	}

}
