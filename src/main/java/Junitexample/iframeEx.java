package Junitexample;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeEx {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void iframeBrowserlaunch()
	{
		System.setProperty("webdriver.chrome.driver","E:\\My Projects\\JavaMethods\\lib\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	@Before
	public void launchApp()
	{
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		
		driver.manage().window().maximize();

	}
	@Test
	public void frametest()
	{
		List<WebElement> frame_find = driver.findElements(By.tagName("iframe"));
		
		
		for(int i = 0; i<frame_find.size(); i++)
	
		{
			System.out.println("name is: "+frame_find.get(i).getAttribute("name"));
			
			System.out.println("id is: "+frame_find.get(i).getAttribute("id"));
			
			System.out.println("title is: "+frame_find.get(i).getAttribute("title"));
		}
		
	}
	
	@Test
	public void frame()
	
	{
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame("iframeResult");
		
		System.out.println(driver.getTitle());
		
		System.out.println("switched Here");
				
	}
	
    @Test
	public void frame3()
	
	{
		
         System.out.println(driver.getTitle());
		
		driver.switchTo().frame(0);
		
		System.out.println(driver.getTitle());
		
		System.out.println("switched Here");
		
		driver.switchTo().frame(0);

		System.out.println(driver.getTitle());

   
   
}


}

