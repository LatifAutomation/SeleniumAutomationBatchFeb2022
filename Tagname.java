package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML3/Tagname7.html");
		
		driver.manage().window().maximize();
		
		//First Name
		
		WebElement ele = driver.findElement(By.tagName("input"));
		ele.sendKeys("Testing");
		
		
		driver.findElement(By.tagName("input")).sendKeys("Selenium");
		
		By ele2 = By.tagName("input");
		WebElement fname = driver.findElement(ele2);
		fname.sendKeys("Manual Testing");
		

	}

}
