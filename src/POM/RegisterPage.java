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
	private WebElement createAcc;
	@FindBy(id="password")
	private WebElement pwd;
	@FindBy(id="profile_title")
	private WebElement title;
	@FindBy(xpath="//dd[@title='First name']")
	private WebElement firstName;
	@FindBy(xpath="//dd[@title='Last name']")
	private WebElement lastName;
	@FindBy(id="mobile_number")
	private WebElement mobNumber;
	
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
	public void createAcc() 
	{
		createAcc.click();
	}
	public void pwd(String password) 
	{
		pwd.sendKeys(password);
	}
	public void title() 
	{
		title.click();
	}
	public void firstName(String fN) 
	{
		firstName.sendKeys(fN);
	}
	public void lastName(String lN) 
	{
		lastName.sendKeys(lN);
	}
	public void mobNumber(String mobNo) 
	{
		mobNumber.sendKeys(mobNo);
	}
}
