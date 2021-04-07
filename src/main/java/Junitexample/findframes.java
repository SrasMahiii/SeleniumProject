package Junitexample;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findframes {
	
	WebDriver driver;
	
	public void frame121()
	
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
	public void frametest1()
	
	{
		
		List<WebElement> iframe_find = driver.findElements(By.tagName("iframe"));
		
		
		for(int i = 0; i<iframe_find.size(); i++)
	
		{
			System.out.println("name is: "+iframe_find.get(i).getAttribute("name"));
			
			System.out.println("id is:" +iframe_find.get(i).getAttribute("id"));
			
			System.out.println("title is: " +iframe_find.get(i).getAttribute("title"));


		}
	
	
	}
	
	

}
