package Seleniumsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentBuzzAnnatationclass {

	@BeforeClass	
	public void beforeClass()
	{
		System.out.println("**************");
		
		System.out.println("System.setup");
		
		System.out.println("***************");
		
	}
	
	@BeforeMethod
	public void Setup2()
	
	{
		System.out.println("****************");

		System.out.println("Chrome");

		System.out.println("URL");

		System.out.println("*****************");
		
	}
	
	@Test(priority=3)
	public void ZTest()
	
	{
		System.out.println("******************");
		
		System.out.println("login user1");

		System.out.println("login password");

		System.out.println("login");

		System.out.println("********************");
		
		}
	@Test(priority=2)
    public void YTest()
    
    {
		System.out.println("********************");

		System.out.println("login user2");

		System.out.println("login password");

		System.out.println("login");

		System.out.println("*********************");
		
    }
	
	@Test(priority=1)
	public void XTest()
	{
		System.out.println("***********************");
		
		System.out.println("login user3");

		System.out.println("login password");
		
		System.out.println("login");
		
		System.out.println("************************");
		
	}
	@Test(priority=0)
	public void ATest()
	{
		System.out.println("************************");
		
		System.out.println("login user4");
		
		System.out.println("login password");
		
		System.out.println("login");
		
		System.out.println("*************************");
		
		System.out.println("System.setup");
		
	}
	
	@AfterMethod
	
	public void closebrowser()
	
	{
		System.out.println("closebrowser");
		
	}
	
	@AfterClass
	
	public void quitbrowser()
	
	{
		System.out.println("quit the driver");
		
	}

}
