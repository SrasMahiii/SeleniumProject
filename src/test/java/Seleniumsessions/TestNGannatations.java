package Seleniumsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGannatations {

		  @BeforeClass
		  public static void beforeClass() 
	{
		  System.out.println("in before class");
		  }
		  //execute only once, in the end
		  @AfterClass
		  public static void afterClass() 
		  {
		  System.out.println("in after class");
		  }
		  //execute for each test, before executing test
		  @BeforeClass
		  public void before()
		  {
		  System.out.println("in before");
		  }
		  //execute for each test, after executing test
		  @AfterClass
		  public void after() 
		  {
		  System.out.println("in after");
		  }
		  //test case 1
		  @Test
		  public void testCase1()
		  {
		  System.out.println("in test case 1");
		  }
		  @Test
		  public void testCase2()
		  {
		  System.out.println("in test case 2");
		  }
}

