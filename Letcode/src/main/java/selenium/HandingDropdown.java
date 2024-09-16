package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandingDropdown {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/dropdowns");
         driver.manage().window().maximize();
         
         WebElement fruits = driver.findElementById("fruits");
         Select myfruits = new Select(fruits);
         myfruits.selectByVisibleText("Orange");
         
         
         WebElement country =driver.findElementById("country");
         Select mycountry = new Select(country);
         mycountry.selectByValue("India");
         mycountry.selectByValue("Brazil");
         
System.out.println(mycountry.getFirstSelectedOption().getText());
         
           
         
         WebElement language =driver.findElementById("lang");
         Select mylanguage = new Select(language);
         List <WebElement> lang = mylanguage.getAllSelectedOptions();
         
         
         
         for (WebElement object : lang) {
        	 
        	 System.out.println(object.getText());
			
		}
         
          
         

	}

}
