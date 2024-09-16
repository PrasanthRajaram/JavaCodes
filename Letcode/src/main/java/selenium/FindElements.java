package selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/edit");
         
       List<WebElement> list = driver.findElementsByTagName("label");
         
         
         for (WebElement label : list) {
        	 System.out.println(label.getText());
			
		}
         System.out.println(list.size());
         
         
         driver.quit();

	}

}
