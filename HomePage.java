package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	WebDriver ldriver;
	
	By header=By.xpath("//h1");
	
	By getstarfree=By.xpath("//a[@id='signupModalButton']");
	
	String exttitle="App & Browser Testing Made Easy";
	
	public HomePage(WebDriver driver)
	{
		this.ldriver=driver;
	}
	
	
	public void headerverify()
	{
		String actualtitle = ldriver.findElement(header).getText();
		if(actualtitle.equalsIgnoreCase(exttitle))
		{
			System.out.println("Header is verified");
		
		}
		
		else
		{
			System.out.println("We are in wrong page");
		}

    }
	
	
	public void clickGetstartedFree()
	{
	
		ldriver.findElement(getstarfree).click();
		
     
	}

	
}