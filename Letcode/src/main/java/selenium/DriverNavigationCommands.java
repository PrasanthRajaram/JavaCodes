package selenium;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigationCommands {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/buttons");
         
        String url=  driver.getCurrentUrl();
        System.out.println("Button url  " + url);
        Thread.sleep(3000);
        driver.findElementById("home").click();
        
        
 String homeUrl=  driver.getCurrentUrl();
 System.out.println("Homepage url  " + homeUrl);
 Thread.sleep(3000);
 driver.navigate().back();
 driver.navigate().forward();
 
 System.out.println("return to button page  " + driver.getCurrentUrl());
 
 
 driver.navigate().refresh();
 Thread.sleep(3000);
 driver.navigate().to("https://letcode.in/");
 
 
        Navigation nav=driver.navigate();
        nav.back();
        nav.forward();
        nav.refresh();

	}

}
