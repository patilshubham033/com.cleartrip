package flight_booking_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.FlightsSearchPage;
import POM.HomePage;
import POM.JourneyDetails;

public class FlightBookingTest 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		//open the browser
		driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		//open home page & go to flights page
		HomePage homePage = new HomePage(driver);
		homePage.flight();
		
		//
		JourneyDetails journeyDetails = new JourneyDetails(driver);
		journeyDetails.roundTrip();
		journeyDetails.from("pune");
		journeyDetails.suggestions();
		journeyDetails.to("singa");
		journeyDetails.suggestions();
		journeyDetails.departOn("25/02/2017");
		journeyDetails.returnOn("3/03/2017");
		Select adults = new Select(journeyDetails.adults());
		adults.selectByVisibleText("5");
		Select children = new Select(journeyDetails.children());
		children.selectByVisibleText("2");
		Select infants = new Select(journeyDetails.infants());
		infants.selectByVisibleText("3");
		journeyDetails.searchFlights();
		driver.findElements(By.xpath("//button[@class='booking']")).get(0).click();
		
		
		//FlightsSearchPage flightsearch = new FlightsSearchPage(driver);
		
		
	}
	
}
