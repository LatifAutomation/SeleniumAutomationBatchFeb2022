package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismultiple {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/Select.html");
		driver.manage().window().maximize(); 
		
		
		//Identify the element on which action need to perform
		
		WebElement drp = driver.findElement(By.name("cars"));
		
		//Create a object of seelct class
		
		
		Select sel=new Select(drp);
		
		
		//Verify drop down is multiselected or not
		
		
		if(sel.isMultiple())
		{
			System.out.println("Drop down is Multi selected");
		}
		
		else
		{
			System.out.println(" drop down is not multi selected");
		}
		
	}

}
