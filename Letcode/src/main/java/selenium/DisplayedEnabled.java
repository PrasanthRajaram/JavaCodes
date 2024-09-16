package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in");
         
         WebElement logIn = driver.findElementByLinkText("Log in");
            boolean       displayed = logIn.isDisplayed();
            System.out.println(displayed);
            
            driver.get("https://letcode.in/edit");
            
           boolean edit= driver.findElementById("noEdit").isEnabled();
           System.out.println(edit);
            
           driver.quit();
         

	}

}
