package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/alert");
         //accept
         driver.findElementById("accept").click();
         Alert alert = driver.switchTo().alert();
          String text = alert.getText();
          System.out.println("simple alert "+ text);
          alert.accept();
         //confirm
          
          //prompt
          
          driver.findElementById("prompt").click();
          driver.switchTo().alert().sendKeys("prasanth");
          System.out.println(alert.getText());
          alert.accept();
         String name = driver.findElementById("myName").getText();
          System.out.println(name);
          
	
	}


}
