package FinDElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/popups");
	driver.manage().window().maximize();
	
	WebElement ele = driver.findElement(By.id("radio"));
	
	if(ele.isSelected())
	{
		ele.click();
		
	}
	
	else 
	{
		System.out.println("Element is not selected");
	}

	}

}
