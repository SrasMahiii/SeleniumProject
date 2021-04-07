package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	
	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	
	WebElement RegLink;
	
	@FindBy(how = How.NAME, using = "firstName")
	
	WebElement FirstName;
	
	@FindBy(how = How.NAME, using = "lastName")
	
	WebElement LastName;

	@FindBy(name = "phone")
	
	WebElement phone;
	
	@FindBy(name = "userName" )
	
	WebElement userName;
	
	@FindBy(name = "address1")
	WebElement address1;
	
	@FindBy(name = "city")
	WebElement city;
	
	@FindBy(name = "state")
	WebElement state;
	
	@FindBy(name = "postalCode")
	WebElement postalCode;
	
	@FindBy(name = "country")
	WebElement country;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(name = "submit")
	WebElement submit;
	

     RegistrationPage(WebDriver d) //*craete a constructor here
{
	driver = d;
	
	PageFactory.initElements(d, this);  //this ......is the variable
}
public void clickRegLink()
{
	RegLink.click();
}
public void setFirstName(String fname)
{
	FirstName.sendKeys(fname);
}
public void setLastName(String lname)
{
	LastName.sendKeys(lname);
	
}
public void setphone(String ph)
{
	phone.sendKeys(ph);
	
}
public void setuserName(String uname)
{
	userName.sendKeys(uname);

}
public void setaddress1(String addr)
{
	address1.sendKeys(addr);
	
}
public void setcity(String city1)
{
	city.sendKeys(city1);
	
}
public void setstate(String sta)
{
	state.sendKeys(sta);
	
	}
public void setpostalCode(String postal)
{
	postalCode.sendKeys(postal);
	
}
public void setcountry(String count)
{
	country.sendKeys(count);
	
}
public void setemail(String mail)
{
	email.sendKeys(mail);
	
}
public void setpassword(String pword)
{
	password.sendKeys(pword);
	
}
public void setconfirmPassword(String cpass)
{
	confirmPassword.sendKeys(cpass);
	
}
public void clicksubmit()
{
  submit.click();
	
}
}
