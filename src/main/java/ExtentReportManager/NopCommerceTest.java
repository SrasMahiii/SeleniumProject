package ExtentReportManager;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class NopCommerceTest {
	
	public WebDriver driver;
	
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	@BeforeTest
	public void setExtent()
	{
		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/MyReport.html");
		htmlreporter.config().setDocumentTitle("Automation Report");//Title of the report
		htmlreporter.config().setReportName("Functional Report");//Name of the report
		htmlreporter.config().setTheme(Theme.STANDARD);
		//*********************************************	
		// Ourcommon info
		extent = new ExtentReports();	
		extent.attachReporter(htmlreporter);		
		extent.setSystemInfo("HostName", "LocalHost");
		extent.setSystemInfo("OSName", "Windows");
		extent.setSystemInfo("TesterName", "Mahesh Mali");
		extent.setSystemInfo("Browser", "Chrome");
	}
	@AfterTest
	public void EndReport()
	{
		extent.flush();
	}
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver" , "F:\\My Projects\\JavaMethods\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.nopcommerce.com/");
		
	}
	@Test
	public void noCommerceTitleTest()
	{
		test = extent.createTest("noCommerceTitleTest");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "noCommerce demo store");
		
	}
	@Test
	public void noCommerceLogoTest()
	{
		test = extent.createTest("noCommerceLogoTest");
		Boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		Assert.assertTrue(status);
		
	}
	@Test
	public void noCommerceLoginTest()
	{
		test = extent.createTest("noCommerceLoginTest");
		Assert.assertTrue(true);
	
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "TEST CASE IS FAILED IS " + result.getName());
			test.log(Status.FAIL, "TEST CASE IS FAILED IS " + result.getThrowable());
			
			String Screenshotpath = NopCommerceTest.getScreenshot(driver, result.getName());
			test.addScreenCaptureFromPath(Screenshotpath);//adding screen shot
		}
		else if(result.getStatus() == ITestResult.SKIP)
		{
			test.log(Status.SKIP, "TEST CASE SKIPPED IS " + result.getName());
		}
		else if(result.getStatus() == ITestResult.SUCCESS )
		{
			test.log(Status.PASS, "TEST CASE PASSED IS " + result.getName());
		
		}
		 
	}
	public static String getScreenshot(WebDriver driver, String screenshotName ) throws IOException{
	
	String dateName = new SimpleDateFormat("yyyyMMddhhss").format(new Date());
	
   TakesScreenshot ts = (TakesScreenshot) driver;
   
   File source = ts.getScreenshotAs(OutputType.FILE);
   
   String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
   File finalDestination = new File(destination);
   FileUtils.copyFile(source, finalDestination);
   return destination;
   
	}
}

