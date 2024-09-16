package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/dropable");
         
        // driver.switchTo().frame(0);
        WebElement source = driver.findElementById("draggable");
        WebElement target = driver.findElementById("droppable");
        Actions builder = new Actions(driver);
        
        builder.dragAndDrop(source, target).perform();
        
        

	}

}
