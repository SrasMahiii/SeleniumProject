package Com.selenium.Pageobjects.orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageObjects {
	
	WebDriver driver;
	
	//Added comments
	
	@FindBy(xpath = "//b[normalize-space()='Admin']")
	WebElement menu_Admin;
	@FindBy(xpath = "///b[normalize-space()='PIM']")
	WebElement menu_PIM;
	@FindBy(xpath = "//b[normalize-space()='Leave']")
	WebElement menu_Leave;
	
	
	//Create aa Constuructor with the class name
	public HomepageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
				
	}
	public void verifytomenu()
	{
		boolean admin = menu_Admin.isDisplayed();
				
		boolean pim = menu_PIM.isDisplayed();
		
		boolean Leave =  menu_Leave.isDisplayed();
		
		
	}
	

}
