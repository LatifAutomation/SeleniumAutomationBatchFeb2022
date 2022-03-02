package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Email
		
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
	
		//Pass
		
		driver.findElement(By.id("pass")).sendKeys("Tets@12345");

	}

}
