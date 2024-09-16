package testNGbasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Launch {

	@Parameters({"emailId", "password"})
	@Test
	public  void Launching(String email,String pass) {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/");
         driver.manage().window().maximize();
         
         driver.findElementByLinkText("Log in").click();
         
         driver.findElementByName("email").sendKeys(email);
         
         driver.findElementByName("password").sendKeys(pass);
         
         driver.findElementByXPath("//button[.='LOGIN']").click();
         
         System.out.println(driver.getTitle());
         
         driver.quit();
         
         
	}

}
