package selenium;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInputs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/edit");
         
         driver.findElementById("fullName").sendKeys("prasanth");
         
         driver.findElementById("join").sendKeys(" person",Keys.TAB);
         
         String myValue = driver.findElementById("getMe").getAttribute("value");
         System.out.println(myValue);
         
         driver.findElementById("clearMe").clear();
         
         boolean isEdit = driver.findElementById("noEdit").isEnabled();
         System.out.println(isEdit);
         
         String isReadOnly = driver.findElementById("dontwrite").getAttribute("readonly");
         System.out.println(isReadOnly);
         
         driver.quit();         
	}

}
