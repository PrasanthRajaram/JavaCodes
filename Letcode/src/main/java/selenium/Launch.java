package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/");
         driver.manage().window().maximize();
         
         driver.findElementByLinkText("Log in").click();
         
         driver.findElementByName("email").sendKeys("koushik350@gmail.com");
         
         driver.findElementByName("password").sendKeys("Pass123$");
         
         driver.findElementByXPath("//button[.='LOGIN']").click();
         
         
	}

}
