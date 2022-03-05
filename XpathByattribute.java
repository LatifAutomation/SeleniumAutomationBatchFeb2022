package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByattribute {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2");
		driver.manage().window().maximize();
		
		//First name
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("testing");
		
		
		//Last name
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("selenumtesting");
		
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Test@1234");
		
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Test@1234");

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}

}
