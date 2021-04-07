package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightReservation {

	 WebDriver driver;
	@FindBy(name = "tripType")
	WebElement tripType;
	@FindBy(name = "passCount")
	WebElement passCount;
	@FindBy(name = "fromPort")
	WebElement fromPort;
	@FindBy(name = "fromMonth")
	WebElement fromMonth;
	@FindBy(name = "fromDay")
	WebElement fromDay;
	@FindBy(name = "toPort")
	WebElement toPort;
	@FindBy(name = "toMonth")
	WebElement toMonth;
	@FindBy(name = "toDay")
	WebElement toDay;
	@FindBy(name = "servClass")
	WebElement servClass;
	@FindBy(name = "airline")
	WebElement airline;
	@FindBy(name = "findFlights")
	WebElement findFlights;
	
	FlightReservation(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d, this);//this ......is the variable
	}
	public void clicktripType(String tType)
	{
	tripType.sendKeys(tType);
}
	public void setpassCount(String pcount)
	{
		passCount.sendKeys(pcount);
		
	}
	public void setfromPort(String fport)
	{
		fromPort.sendKeys(fport);
	}
	public void setfromMonth(String fMonth)
	{
		fromMonth.sendKeys(fMonth);
	}
	public void setfromDay(String fDay)
	{
		fromDay.sendKeys(fDay);
	}
	public void settoPort(String tport)
	{
		toPort.sendKeys(tport);
	}
	public void settoMonth(String tMonth)
	{
		toMonth.sendKeys(tMonth);
	}
	public void settoDay(String tDay)
	{
		toDay.sendKeys(tDay);
	}
	public void clickservClass()
	{
		servClass.click();
	}
	public void setairline(String aline)
	{
		airline.sendKeys(aline);
	}
	public void clickfindFlights()
	{
		findFlights.click();
	}
}
	
