package testNGbasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.cricbuzz.com/");
         
         driver.findElementById("live-scores-link").click();
         driver.findElementById("domestic-tab").click();
         
	}

}
