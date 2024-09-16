package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/windows");
         
         
         driver.findElementById("home").click();
         
        Set <String> set = driver.getWindowHandles();
        
        List<String> list = new ArrayList(set);

      driver.switchTo().window(list.get(1));
      
      System.out.println(driver.getCurrentUrl());
      
      driver.switchTo().window(list.get(0)).close();
      driver.switchTo().window(list.get(1));
      System.out.println(driver.getCurrentUrl());
      
	}

}