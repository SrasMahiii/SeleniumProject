package Seleniumsessions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreationAnnatationsMySelf {

	@org.testng.annotations.BeforeClass
	
	public void BeforeClass()
	{
		System.out.println("**************************");
		
		System.out.println("System Setup");
		
		System.out.println("***************************");
		
	}
	
	@BeforeMethod
	
	public void AfterClass()
	
	{
		System.out.println("*******************************");
		
		System.out.println("Chrome");
		
	    System.out.println("URL");
	    
	    System.out.println("********************************");
	    
	}
	@Test
	public void step1()
	{
		System.out.println("************************");
		
		System.out.println("login Mahesh");
		
		System.out.println("login Shravaniiiii");
		
		System.out.println("Mahiiisras");
		
		System.out.println("*************************");
	}
	
}
