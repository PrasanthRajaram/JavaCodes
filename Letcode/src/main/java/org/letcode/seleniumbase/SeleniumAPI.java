package org.letcode.seleniumbase;

import org.openqa.selenium.WebElement;

public interface SeleniumAPI {
	
	
	void setUp(String url);
	
	
	void setUp(Browser browserName, String url);
	
	void close();
	void quit ();
	
	WebElement element (String type, String value);
	
	void switchToWindow(int i);
	
	void selectValue(WebElement ele, String value);
	
	void selectText(WebElement ele, String text);
	
	void selectIndex(WebElement ele, int position);
	
	void click(WebElement ele);
	
	
	
	void appendText(WebElement ele, String testData);
	
	
	String getTitle();
	
	
	String getURL();
	
	boolean isDisplayed(WebElement ele);
	
	
	boolean isEnabled(WebElement ele);
	
	boolean isSelected(WebElement ele);


	void type(WebElement ele, String value);
	
	
	
	
	
	
	

}
