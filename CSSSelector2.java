package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//First name
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Testing");
		
		//Password
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("automation");

		//Login
		
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
	}

}
