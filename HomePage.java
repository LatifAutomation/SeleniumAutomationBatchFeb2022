package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{

	WebDriver driver;
	
	@FindBy(xpath="//h1")
	WebElement header;
	
	@FindBy(id="signupModalButton")
	WebElement signupbtn;
	
	@FindBy(linkText="Sign in")
	WebElement signinlink;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyHeader()
	{
		String Expectedtitle = "App & Browser Testing Made Easy";
		
		String actualtitle = header.getText();
		assertequals(Expectedtitle,actualtitle);
	}

	public void signupClick()
	{
		signupbtn.click();
	}
	
	public void signinClick()
	{
		signinlink.click();
	}

	private void assertequals(String expectedtitle, String actualtitle) {
		// TODO Auto-generated method stub
		
	}
}
