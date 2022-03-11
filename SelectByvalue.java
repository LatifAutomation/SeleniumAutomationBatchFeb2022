package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByvalue {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Identify teh elemnt
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		
		//create object of select class
		
		
		Select sel=new Select(drop);
		
		//Select by value
		
		sel.selectByValue("search-alias=popular");
		Thread.sleep(3000);
		sel.selectByValue("search-alias=sporting");
		
		

	}

}
