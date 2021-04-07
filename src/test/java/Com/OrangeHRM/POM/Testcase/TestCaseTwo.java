package Com.OrangeHRM.POM.Testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.OrangeHRM.POM.Baseclass.TestBase;

import Com.selenium.Pageobjects.orangeHRM.HomepageObjects;
import Com.selenium.Pageobjects.orangeHRM.LoginPageObjects;

public class TestCaseTwo extends TestBase {	
	LoginPageObjects loginPage;
			
//	@	Test(dataProvider="loginDataInv")
//	public void hrmlogin(String userName , String password) 	
//	{		
//loginPage=new LoginPageObjects(driver);	
//loginPage.loginHRM(userName, password);

	@	Test
	public void hrmlogin2() 	
	{		
//		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
//	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
loginPage = new LoginPageObjects(driver);	
loginPage.loginHRM("Admin", "admin123");

HomepageObjects homepage = new HomepageObjects(driver);

                             homepage.verifytomenu();
	
}

	//*Elements
//	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
//	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
////		
//	@DataProvider(name="loginDataInv")     //  we provide aa Dataprovider 
//	public String[][] getData()      // We Create aa method of GET Data that returns to the string @"Two dimentional array"@
//	{
//		String[][] testData = {
//				
//				{"Student" , "buzz"},
//				{"Student2" , "buzz"},
//				//{"Student3" , "buzz"},
//				//{"Student4" , "buzz"},
//				//{"Student5" , "buzz"}
//		};
//		
//		return testData;
//	}
//	
//	@DataProvider(name="loginDataV")
//	public String[][] getDataV()
//	{ 
//		String[][] testData = {
//				
//				{"Admin", "admin123"},
////				{"Student2" , "buzz"},
////				{"Student3" , "buzz"},
////				{"Student4" , "buzz"},
////				{"Student5" , "buzz"}
//		};
//		
//		return testData;
//}
}


