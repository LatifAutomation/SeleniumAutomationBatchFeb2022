package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector3 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//First name
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("Testing");
		
		//Password
		driver.findElement(By.cssSelector("input#pass")).sendKeys("automation");

		//Login
		
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
	}

}
