package selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountInterview {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.cricbuzz.com/");
         
      List<WebElement> cricket =    driver.findElementsByXPath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]");
      
      System.out.println(cricket.size());
         
         driver.quit();    
	}

}
