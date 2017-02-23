package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JourneyDetails 
{
	@FindBy(id="RoundTrip")
	public WebElement roundTrip;
	@FindBy(id="FromTag")
	public WebElement from;
	@FindBy(id="ToTag")
	public WebElement to;
	@FindBy(id="DepartDate")
	public WebElement departOn;
	@FindBy(id="ReturnDate")
	public WebElement returnOn;
	@FindBy(id="Adults")
	public WebElement adults;
	@FindBy(id="Childrens")
	public WebElement children;
	@FindBy(id="Infants")
	public WebElement infants;
	@FindBy(id="MoreOptionsLink")
	public WebElement moreOption;
	@FindBy(id="Class")
	public WebElement classOfTravel;
	@FindBy(id="AirlineAutocomplete")
	public WebElement preferredAirline ;
	@FindBy(id="SearchBtn")
	public WebElement searchFlights ;
	
	public JourneyDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void roundTrip()
	{
		roundTrip.click();
	}
	public void from(String From )
	{
		from.sendKeys(From);
	}
	public void to(String To)
	{
		to.sendKeys(To);
	}
	public void departOn(String Depart)
	{
		departOn.sendKeys(Depart);
	}
	public void returnOn(String Return)
	{
		returnOn.sendKeys(Return);
	}
	public void adults()
	{
		adults.click();
	}
	public void children()
	{
		children.click();
	}
	public void infants()
	{
		infants.click();
	}
	public void moreOption()
	{
		moreOption.click();
	}
	public void classOfTravel()
	{
		classOfTravel.click();
	}
	public void preferredAirline(String PreferredAirline)
	{
		preferredAirline.sendKeys(PreferredAirline);
	}
	public void searchFlights()
	{
		searchFlights.click();
	}
	
}
