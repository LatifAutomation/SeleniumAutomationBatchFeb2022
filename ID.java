package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/HTML3/ID4.html");
		driver.manage().window().maximize();
		
		//First Name
		
		driver.findElement(By.tagName("input")).sendKeys("Manual Testing");
		
		//Middle name
		
		driver.findElement(By.id("abc")).sendKeys("Automation Testing");
	}

}
