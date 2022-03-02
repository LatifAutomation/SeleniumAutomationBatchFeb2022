package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name2 {

	public static void main(String[] args)
	{
		
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	//Email
	
	driver.findElement(By.name("email")).sendKeys("78966541323");
	
	//Password
	
	driver.findElement(By.name("pass")).sendKeys("Test@12345");
	
	//Login button
	
	driver.findElement(By.name("login")).click();
	
	
	}

}
