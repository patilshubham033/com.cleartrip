package flight_booking_test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.RegisterPage;

public class Register_test 
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
		//open home page & go to register page
		HomePage homepage = new HomePage(driver);
		homepage.yourTrip();
		homepage.register();
		Reporter.log("Home Page Open", true);
		
		//fill all the details in registration page
		RegisterPage registerPage = new RegisterPage(driver);
		
		//switch to I_frame
		driver.switchTo().frame(registerPage.iframe());
		Reporter.log("Register Page Open", true);
		
		registerPage.emailId("shjsabhb@gmail.com");
		registerPage.checkBox();
		registerPage.createAcc();
		registerPage.pwd("Shubham@33");
		Select select = new Select(registerPage.title());
		select.selectByVisibleText("Mr");
		registerPage.firstName("firstname");
		registerPage.lastName("lastname");
		registerPage.mobNumber("9595993008");
		//driver.switchTo().defaultContent();
		//registerPage.checkBox();
		registerPage.createAcc();
		Reporter.log("sucessfully register", true);
		
		//verify registration
		Assert.assertEquals(driver.getTitle(), "Your trips");
		
	}
}
