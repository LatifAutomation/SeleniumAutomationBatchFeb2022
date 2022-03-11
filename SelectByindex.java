package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByindex {

	public static void main(String[] args) 
	{
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize(); 
	
	
	//Identify the element on which action need to perform
	
	WebElement drp = driver.findElement(By.name("url"));
	
	//craete the object of select class
	
	
	Select sel=new Select(drp);
	
	//Perform the action 
	
	sel.selectByIndex(10);
	
	
	
	}

}
