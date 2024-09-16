package org.letcode.seleniumbase;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase implements SeleniumAPI{
	
	
	ChromeDriver driver = null;
	WebDriverWait wait = null;

	@Override
	public void setUp(String url) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.get(url);
         wait = new WebDriverWait(driver, 10);
         
	}

	@Override
	public void setUp(Browser browserName, String url) {
		
		switch (browserName) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
			break;
		case EDGE:
			break;
		case FIREFOX:
			break;
		default:
			break;
		}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         driver.get(url);
	         wait = new WebDriverWait(driver, 10);
		
		//* case "chrome":
		//	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//	 driver = new ChromeDriver();
		//	break;  

		//default:
		//	break;
			
			
		
	}

	@Override
	public void close() {
		driver.close();
		
	}

	@Override
	public void quit() {
		driver.quit();
		
	}

	@Override
	public WebElement element(String type, String value) {
		
		switch (type) {
		case "id":
			return driver.findElementById(value);
			
		case "xpath":
			
			return driver.findElementByXPath(value);
			
		case "name":
			
			return driver.findElementByName(value);
		
			

		default:
			break;
		}
		
		return null;
	}

	@Override
	public void switchToWindow(int i) {
		
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String> (windowHandles);
		
		driver.switchTo().window(list.get(i));
		
		
	}

	@Override
	public void selectValue(WebElement ele, String value) {
		WebElement element = isElementVisible(ele);
		new Select(element).selectByValue(value);
	}

	@Override
	public void selectText(WebElement ele, String text) {
		WebElement element = isElementVisible(ele);
		new Select(element).selectByVisibleText(text);
		
	}

	@Override
	public void selectIndex(WebElement ele, int position) {
		
		WebElement element = isElementVisible(ele);
		new Select(element).deselectByIndex(position);
	}

	@Override
	public void click(WebElement ele) {
	WebElement element =	wait.withMessage("Element not clickable").until(ExpectedConditions.elementToBeClickable(ele));
	element.click();
		
		
		
	}

	@Override
	public void type(WebElement ele, String value) {
		WebElement element = isElementVisible(ele);
		element.clear();
		element.sendKeys(value);
	}

	private WebElement isElementVisible(WebElement ele) {
		WebElement element =	wait.withMessage("Element not visible").until(ExpectedConditions.visibilityOf(ele));
		return element;
	}
	public void typeAndEnter(WebElement ele, String value, Keys keys) {
		WebElement element = isElementVisible(ele);
		element.clear();
		element.sendKeys(value,keys);
	}
	@Override
	public void appendText(WebElement ele, String testData) {
		WebElement element = isElementVisible(ele);
		element.sendKeys(testData);
		
	}

	@Override
	public String getTitle() {
		
		return driver.getTitle();
	}

	@Override
	public String getURL() {
		
		return driver.getCurrentUrl();
	}

	@Override
	public boolean isDisplayed(WebElement ele) {
		
		return ele.isDisplayed();
	}

	@Override
	public boolean isEnabled(WebElement ele) {
		
		return ele.isEnabled();
	}

	@Override
	public boolean isSelected(WebElement ele) {
		
		return ele.isSelected();
	}

	

	}


