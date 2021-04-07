package ExtentReportManager;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportEx {
	@Test
	public void LoginTest() throws IOException
	{
		System.out.println("login to amazon");
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/learn_automation.html");
		
      ExtentReports extent = new ExtentReports();
      
      extent.attachReporter(reporter);
      
      ExtentTest Logger = extent.createTest("LoginTest");
      
      Logger.log(Status.INFO, "Login to amazon");
      Logger.log(Status.PASS, "Title verified");
      extent.flush();
      
 ExtentTest Logger2 = extent.createTest("LogoffTest");
      
      Logger2.log(Status.INFO, "Login to amazon");
      Logger2.log(Status.FAIL, "Title verified");
      
      //Logger2.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
      
      Logger2.fail("details").addScreenCaptureFromPath("./Users/Hi/Desktop/Mahesh/logo/_D3A4032.JPG");


      extent.flush();
      
	}

}
