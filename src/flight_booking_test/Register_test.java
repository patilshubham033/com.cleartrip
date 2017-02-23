package flight_booking_test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

import POM.HomePage;
import POM.RegisterPage;

public class Register_test 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@org.testng.annotations.Test
	public void test()
	{
		HomePage homepage = new HomePage(driver);
		homepage.yourTrip();
		homepage.register();
		RegisterPage registerPage = new RegisterPage(driver);
		driver.switchTo().frame(registerPage.iframe());
		registerPage.emailId("shjsabhb@gmail.com");
		registerPage.checkBox();
		registerPage.createAcc();
		registerPage.pwd("Shubham@33");
		Select select = new Select(registerPage.title());
		System.out.println("svjv");
	}
}
