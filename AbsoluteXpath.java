package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML3/AbsolueXpath.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/div[1]/input[1]")).sendKeys("Testing");
		
		driver.findElement(By.xpath("html/body/div[2]/a[1]")).click();
		
	}

}
