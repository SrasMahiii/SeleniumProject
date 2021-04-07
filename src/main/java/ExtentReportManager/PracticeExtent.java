package ExtentReportManager;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

public class PracticeExtent {
	
	public WebDriver driver;
	
	public ExtentHtmlReporter htmlreporter;
	
	public ExtentReports extent;
	
	public ExtentTest test;
	
	@BeforeTest
	public void setupExtent()
	{
		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.utf")+"/test-output/ExtentReports.html");
		
		//htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/MyReport.html");

		
		htmlreporter.config().setDocumentTitle("Auto Report");
		
		htmlreporter.config().setReportName("Function Name");
		
		htmlreporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
				
	    extent.attachReporter(htmlreporter);
		
		extent.setSystemInfo("HostName is", "Shravaniiiii");
		
		extent.setSystemInfo("OS Name", "Windows");
		
		extent.setSystemInfo("Tester name", "'Mahiii");
		
		extent.setSystemInfo("Browser", "Firefox");
		
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
		driver.get("http://demo.nopcommerce.com");
		driver.manage().window().maximize();

	}
	@Test
	public void  nopcommercetitleTest()
	{
		test = extent.createTest("nopcommerceloginTest");    //To enter Entries
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "nopCommerce demo store"); //to check weather its fail or pass
		
	}
	@Test
	public void  nopcommercelogoTest()
	{
		test = extent.createTest("nopcommerceloginTest"); //Another Entries{just copy from above method}
		
		Boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed(); //{Write a Xpath a logo of ur application}
		
       Assert.assertTrue(true);
	}
   @Test
    public void  nopcommerceloginTest()
   {
		test = extent.createTest("nocommerceloginTest");
		
		Assert.assertTrue(true); //{again we check weather it is true or false}
   }
   
   @AfterMethod
   public void tearDown(ITestResult result) throws IOException   
   {
	   if(result.getStatus() == ITestResult.FAILURE)
	   {
		   test.log(Status.FAIL, "TEST CASE FAILLED IS : "+result.getName());      //  { To check this case is failled or not through the if condition}
		   test.log(Status.FAIL, "TEST CASE FAILLED IS : "+result.getThrowable());
		   
		   String screenshotpath = NopCommerceTest.getScreenshot(driver, result.getName());  //to create a object for screenshot with the help of getscreenshot and getname
		   test.addScreenCaptureFromPath(screenshotpath);    //test is the Referral Object for every line as much as possible
		   
	   }
	   else if(result.getStatus() == ITestResult.SKIP)     //use skip to skipped this case by using get status command
   {
		   test.log(Status.SKIP, "TEST CASE SKIPPED IS : "+result.getName());
		   
   }
	   else if(result.getStatus() == ITestResult.SUCCESS)
	   {
        test.log(Status.PASS, "TEST CASE PASSED IS : "+result.getName());		   
	   }
   }
   
	   
	   public static String getScreenshot(WebDriver driver, String screenshotName ) throws IOException
	   {
			
			String dateName = new SimpleDateFormat("yyyyMMddhhss").format(new Date());
			
		   TakesScreenshot ts = (TakesScreenshot) driver;
		   
		   File source = ts.getScreenshotAs(OutputType.FILE);
		   
		   String destination = System.getProperty("user.dir") + "/Screenshots1111/" + screenshotName + dateName + ".png";
		   File finalDestination = new File(destination);
		   FileUtils.copyFile(source, finalDestination);
		   return destination;
}
}
