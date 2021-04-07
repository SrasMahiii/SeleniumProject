package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlightReservationTest {
@Test
public void VerifyFlightReservation() throws InterruptedException
{
	WebDriver driver;

	System.setProperty("webdriver.chrome.driver",  "F:\\My Projects\\JavaMethods\\lib\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	FlightReservation FRTest = new FlightReservation(driver);
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	
    FRTest.clicktripType("roundtrip");
    Thread.sleep(4000);

     FRTest.setpassCount("2");
     Thread.sleep(4000);

    FRTest.setfromPort("Sydney");
    Thread.sleep(4000);

     FRTest.setfromMonth("July");
     Thread.sleep(4000);

    FRTest.setfromDay("24");
    Thread.sleep(4000);

    FRTest.settoPort("New York");
    Thread.sleep(4000);

    FRTest.settoMonth("July");
    Thread.sleep(4000);

    FRTest.settoDay("29");
    Thread.sleep(4000);

    FRTest.clickservClass();
    Thread.sleep(4000);

    FRTest.setairline("Unified Airlines");
    Thread.sleep(4000);
   
    FRTest.clickfindFlights();
    
   if(driver.getPageSource().contains("Thank You for the registering"))
   {
	 System.out.println("The reservation is confirmed");
	 
   }
   else
   {
	   System.out.println("The reservation is not confirmed");
   }
}

}
