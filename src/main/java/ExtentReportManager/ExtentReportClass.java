package ExtentReportManager;

import java.io.File;

import org.testng.annotations.Test;

public class ExtentReportClass {
	
	@Test public void Testting()
	
	{
		String fileName = "ExtentAutomationReport,html";

		String directory = System.getProperty("user.dir")+"/hrmReoprts";		
		new File(directory).mkdirs();		
		System.out.println(directory);
		
		String path = directory + fileName;	
		
	}
	

}
