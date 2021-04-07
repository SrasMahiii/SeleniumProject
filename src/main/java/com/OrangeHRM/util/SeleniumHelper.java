package com.OrangeHRM.util;

import org.openqa.selenium.WebElement;

public class SeleniumHelper
{
	
	public void typeTextInTextBox(WebElement element , String textToBeEnter)
	{
		element.isDisplayed();
		element.isEnabled();
		element.clear();
		element.sendKeys(textToBeEnter);
		
}
	public void btn_click(WebElement element)
	{
		element.isDisplayed();
		element.isEnabled();
		element.click();
		element.click();
	}

}
