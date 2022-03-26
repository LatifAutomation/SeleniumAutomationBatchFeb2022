package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpClass 
{

	
	WebDriver driver;
	
	@FindBy(id="user_full_name")
	WebElement fullname;
	
	
	@FindBy(id="user_email_login")
	WebElement email;
	
	
	@FindBy(id="user_password")
	WebElement password;
	
	
	@FindBy(id="tnc_checkbox")
	WebElement chckbx;
	
	@FindBy(id="user_submit")
	WebElement submit;
	
	
	public SignUpClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterFullname(String fname)
	{
		fullname.sendKeys(fname);
	}
	
	
	public void enteremail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void enterpass(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void checkboxclick()
	{
		chckbx.click();
	}
	
	public void submitclick()
	{
		submit.click();
	}
}
