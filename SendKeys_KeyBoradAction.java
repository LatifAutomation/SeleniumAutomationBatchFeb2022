package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_KeyBoradAction {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Identify the element
		
		WebElement drp = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		drp.sendKeys(Keys.ARROW_DOWN);
		
		drp.sendKeys(Keys.ENTER);
		

	}

}
