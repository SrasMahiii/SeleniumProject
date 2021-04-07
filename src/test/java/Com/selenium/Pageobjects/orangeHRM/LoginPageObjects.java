package Com.selenium.Pageobjects.orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.util.SeleniumHelper;

public class LoginPageObjects extends SeleniumHelper{          // *POM is a reusable componant for every test
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement txt_Username;
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement txt_Password;
	@FindBy(id = "//input[@id='btnLogin']")
	WebElement 	btn_Login;

	public LoginPageObjects(WebDriver driver)     //create aa constuctor with the help of "this keyword"
	{
		this.driver = driver;   // "this" keyword is going to be represented the particular class
		                                  // EX : LoginPageObjects.driver(class driver) = driver(Method driver);
		
		// page object model your using with the Page Factory
		 
		PageFactory.initElements(driver, this);    //Your pagefactory is initializeed now
		
	}
	public void loginHRM(String userName , String password)
	{
		typeTextInTextBox(txt_Username, userName);
		typeTextInTextBox(txt_Password, password);
		btn_click(btn_Login);
//		txt_Username.isDisplayed();
//		txt_Username.isEnabled();
//	   txt_Username.clear();                         //*Above This two operation very commons for every textbox
//		txt_Username.sendKeys(userName);
//		
//		txt_Password.isDisplayed();
//		txt_Password.isEnabled();
//		txt_Password.clear();
//		txt_Password.sendKeys(password);
//		
//		
//		btn_Login.isEnabled();
//		btn_Login.clear();
//		btn_Login.click();
	}
	
	}
	

