package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML3/Tagname8.html");
		
		driver.manage().window().maximize();
		
		//First Name
		
		WebElement fname = driver.findElement(By.tagName("input"));
		fname.sendKeys("Manual");
		
		
		//Middle Name
		
		WebElement erfewrytyt = driver.findElement(By.tagName("input"));
		erfewrytyt.sendKeys("Selenium");
		
	}

}
