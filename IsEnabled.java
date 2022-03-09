package FinDElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//
		
		WebElement ele = driver.findElement(By.xpath("//input[@title='Search']"));
		
		
		if(ele.isEnabled())
		{
			ele.sendKeys("Automation Testing");
		}
		
		else
		{
			System.out.println("Element is not enabled");
		}

	}

}
