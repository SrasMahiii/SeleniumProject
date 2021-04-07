package Junitexample;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class W3Shoolframes {
	
	static WebDriver driver;
	
	@BeforeClass
	public  static void browserlaunch()
	
	{

		System.setProperty("webdriver.chrome.driver", "F:\\My Projects\\JavaMethods\\lib\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}
	@Before
	public void applaunch()
	{
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.manage().window().maximize();
		
	}
	@Test
	public void fmethod()
	
	{
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame("iframeResult");
		
		System.out.println(driver.getTitle());
		
		System.out.println("switched");
	}
	
	
	
	
	

}
