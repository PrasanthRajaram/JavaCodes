package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextandGetAttribute {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/edit");
         
         WebElement header =driver.findElementByTagName("h1");
        String text = header.getText();
        System.out.println(text);
        
        
        String attribute = driver.findElementById("join").getAttribute("value");
        System.out.println(attribute);
        
        String attribute2 = driver.findElementById("fullName").getAttribute("placeHolder");
        System.out.println(attribute2);

	}

}
