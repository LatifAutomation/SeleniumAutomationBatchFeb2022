package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreeAccountPage 
{

	WebDriver driver;
	
	By header=By.xpath("//h1");

	By fullname=By.xpath("//input[@id='user_full_name']");
	
	By email=By.xpath("//input[@id='user_email_login']");
	
	By pwd=By.xpath("//input[@id='user_password']");
	
	By checkbx=By.xpath("//input[@id='tnc_checkbox']");
	
	By signup=By.xpath("//input[@id='user_submit']");
	
	
	
	public FreeAccountPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void  verifyHeader()
	{
		System.out.println(driver.findElement(header).isDisplayed());
	}
	

	public void enterFullname() 
	{
		driver.findElement(fullname).sendKeys("Pratibha Naik");
	}
	
	
	public void enteremail()
	{
		driver.findElement(email).sendKeys("naikpratibha263@gmail.com");
	}
	
	public void enterpass()
	{
		driver.findElement(pwd).sendKeys("Test@1234");
	}
	
	
	public void checkboxclick()
	{
		driver.findElement(checkbx).click();
	}
	
	
	public void signupClick()
	{
		driver.findElement(signup).click();
	}
}
