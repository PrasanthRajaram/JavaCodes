package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/frame");
         
         driver.switchTo().frame(0);
         driver.findElementByName("fname").sendKeys("prasanth");
         driver.findElementByName("lname").sendKeys("R");
         driver.switchTo().frame(1);
         driver.findElementByName("email").sendKeys("prasanththecharm");
         driver.switchTo().parentFrame();
         driver.findElementByName("lname").sendKeys("L");
         driver.switchTo().parentFrame();
        WebElement ele =driver.findElementByClassName("card-footer-item");
                      ele.click(); 

	}

}