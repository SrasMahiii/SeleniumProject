package Junitexample;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx {

	static WebDriver driver;
	
	@BeforeClass
	public static void Setup()
	{ 
		System.setProperty("webdriver.chrome.driver","E:\\My Projects\\JavaMethods\\lib\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}
	@Before
	public void launchApplication()
	{
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void frame()
	{
		System.out.println(driver.getTitle());

		driver.switchTo().frame("iframeResult");
		
		System.out.println(driver.getTitle());
		
		System.out.println("switched");
	}
	
	
	
	
}
