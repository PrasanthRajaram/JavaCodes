package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/");
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.findElementByLinkText("Log in").click();
         
         driver.findElementByName("email").sendKeys("koushik350@gmail.com");
         
         driver.findElementByName("password").sendKeys("Pass123$");
	}

}
