package testNGbasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderhere {
	
	@DataProvider()
	public String[][] getData()
	{
		String [][] data = new String [2][2];
		
		data[0][0] = "koushik350@gmail.com";
		data[0][1] = "Pass123$";
		data[1][0] = "koushik350@letcode.in";
		data[1][1] = "Pass123$";
		return data;
	}


	@Test (dataProvider = "getData")
	public  void Launching(String data[]) {
		
		System.out.println(data[0]);
		System.out.println(data[1]);
		
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 * ChromeDriver driver = new ChromeDriver(); driver.get("https://letcode.in/");
		 * driver.manage().window().maximize();
		 * 
		 * driver.findElementByLinkText("Log in").click();
		 * 
		 * driver.findElementByName("email").sendKeys(data[0]);
		 * 
		 * driver.findElementByName("password").sendKeys(data[1]);
		 * 
		 * driver.findElementByXPath("//button[.='LOGIN']").click();
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * driver.quit();
		 */
         
	}

}
