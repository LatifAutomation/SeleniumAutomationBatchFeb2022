package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselctByVisiblettText {

	public static void main(String[] args) throws InterruptedException
	{
         WebDriver  driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/Select.html");
		driver.manage().window().maximize(); 
		
		
		//Identify the element on which action need to perform
		
		WebElement drp = driver.findElement(By.name("cars"));
		
		
		Select sel=new Select(drp);
		
		sel.selectByVisibleText("Opel");
		
		Thread.sleep(3000);
		
		sel.deselectByVisibleText("Opel");
		
		
		
	}

}
