package selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com/login.php/");
         
         driver.switchTo().activeElement().sendKeys("prasanth",Keys.TAB,"sucess",Keys.ENTER);

	}

}
