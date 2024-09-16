package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/table");
         
      WebElement table =  driver.findElementById("simpletable"); 
      List<WebElement> list = table.findElements(By.tagName("th"));
      
    
        for (WebElement webElement : list) {
        	
        	System.out.println(webElement.getText());
		}
        
        
      List<WebElement> allrows=  table.findElements(By.cssSelector("tbody tr"));
    
      for (WebElement webElement : allrows) {
    	  List <WebElement> column = webElement.findElements(By.tagName("td"));
    	  System.out.println(column.get(0).getText());
		
    	  
	}
      
      
      for(int i=0;i<3;i++)
      {
    	  List<WebElement> row=allrows.get(i).findElements(By.tagName("td"));
    	  String lastName = row.get(1).getText();
    	  System.out.println(lastName);
    	  if(lastName.equals("Raj"))
    	  {
    		  row.get(3).findElement(By.tagName("input")).click();
    	  }
    	  
    	  
      }
        
       
	}

}
