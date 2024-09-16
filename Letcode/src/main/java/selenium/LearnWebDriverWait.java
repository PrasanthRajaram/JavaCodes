package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/waits");
         
         driver.findElement(By.id("accept")).click();
         
         WebDriverWait wait = new WebDriverWait(driver, 30);
         
         Alert until =wait.until(ExpectedConditions.alertIsPresent());
         System.out.println(until.getText());
         until.accept();
         

	}
}


