
	
	package Seleniumsessions;

	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.junit.BeforeClass;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import org.testng.annotations.AfterTest;
	import org.testng.annotations.Test;
		
		public class Screenshot11{
	 
			 private WebDriver driver;
			 /**
			  * @param args
			  * @throws IOException
			  */
			 @BeforeClass 
			 public void Initiate()
			 {
			   driver = new ChromeDriver();
			 }
			 @Test
			 public void passurl()
			 {
			  driver.get("https://www.google.com/");
			  }
			 @AfterTest
			 public void TearDown() throws IOException
			 {
			  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			        FileUtils.copyFile(scrFile, new File("F:\\Mahii Pic.png"));

			 }
			 }
			







