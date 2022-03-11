package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByvisibleText {

	public static void main(String[] args)
	{
	
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
		       //Identify teh elemnt
				WebElement drop = driver.findElement(By.id("searchDropdownBox"));
				
				//create object of select class
				
				
				Select sel=new Select(drop);
				
				
				//perform the action
				
				sel.selectByVisibleText("Clothing & Accessories");
				
				
	}

}
