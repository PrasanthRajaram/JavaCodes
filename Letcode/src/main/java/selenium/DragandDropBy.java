package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropBy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/draggable");
         
      
         WebElement ele = driver.findElementById("sample-box");
      
        Actions builder = new Actions(driver); 
        builder.dragAndDropBy(ele,130,150).perform();
	}

}
