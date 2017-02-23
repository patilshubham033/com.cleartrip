package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
	@FindBy(id="username1")
	private WebElement emailId;
	@FindBy(id="mkt_sbpt")
	private WebElement checkBox;
	@FindBy(id="registerButton")
	private WebElement register;
	
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void emailId(String email)
	{
		emailId.sendKeys(email);
	}
	public void checkBox()
	{
		checkBox.click();
	}
	public void register() 
	{
		register.click();
	}
}
