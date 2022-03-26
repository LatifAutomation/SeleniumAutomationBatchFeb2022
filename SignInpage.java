package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInpage 
{

	WebDriver driver;
	
	@FindBy(id="user_email_login")
	WebElement username;
	
	@FindBy(id="user_password")
	WebElement password;
	
	@FindBy(id="user_submit")
	WebElement signinbtn;
	
	public SignInpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void username(String user)
	{
		username.sendKeys(user);
	}
	
	
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void signInClick()
	{
		signinbtn.click();
	}
}
