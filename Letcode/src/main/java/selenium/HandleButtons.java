package selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/buttons");
         
        // driver.findElementById("position").getLocation();
        WebElement ele = driver.findElementById("position");
        Point point =ele.getLocation();
        int x=point.getX();
       int y=  point.getY();
       System.out.println("x - "+ x +"y - " + y );
        
       WebElement btncolor = driver.findElementById("color");
       String color = btncolor.getCssValue("background-color");
        System.out.println(color);
        
        
       Rectangle rect =  driver.findElementById("property").getRect();
       System.out.println(rect.getHeight());
       System.out.println(rect.getWidth());
       System.out.println(rect.getPoint());
       
      /* Dimension dim = rect.getDimension();
       System.out.println(dim.getHeight());
       System.out.println(dim.getWidth());  */
       
       boolean isDisabled = driver.findElementById("isDisabled").isEnabled();
       System.out.println(isDisabled);
       
       driver.quit();       

	}

}
