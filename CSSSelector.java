package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/HTML3/CSSSelector4.html");
		driver.manage().window().maximize();
		//First Name
		
		driver.findElement(By.cssSelector("input[id='fname']")).sendKeys("Testing");
		
		
		//Last name
		
		driver.findElement(By.cssSelector("input[name='lname']")).sendKeys("Automation");
		
	}

}
