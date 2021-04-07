package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageRegistrationTest {
	WebDriver driver;
	
	@Test                                          // To execute this test while using TestNG 
	public void VerifyFlightReg()
	
	{
		
		System.setProperty("webdriver.chrome.driver",  "F:\\My Projects\\JavaMethods\\lib\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		RegistrationPage RGTest = new RegistrationPage(driver);         //Object creation for Registration page
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   // will provide wait command called as.........implicit wait command
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		RGTest.clickRegLink();                        //here just called object  referance name is ....."RGTest"     
		
		RGTest.setFirstName("Shravaniii");
		
		RGTest.setLastName("Mahesh");
		
		RGTest.setphone("9848063351");
		
		RGTest.setemail("mahesh.skec@gmail.com");
		
		RGTest.setaddress1("gollabuddaram");
		
		RGTest.setcity("Bhupalapally");
		
		RGTest.setstate("Telangana");
		
	   RGTest.setpostalCode("506122");
		
		RGTest.setcountry("INDIA");
		
		RGTest.setuserName("mahesh.skec@gmail.com");
		
		RGTest.setpassword("Sras@3351");
		
		RGTest.setconfirmPassword("Sras@3351");
		
		RGTest.clicksubmit();
		
		if(driver.getPageSource().contains("Thank You For The Registering"))    // To check whether it is passed or not through the if condition
		{
			System.out.println("Your registered successfully");
			
		}
		else
		{
			System.out.println("Your registered Failled");
		}
		driver.close();                                      // finally close the browser who are currently working
		
	}

}
