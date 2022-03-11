package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleAmazondropdown extends ReusableClass {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		
		
		ReusableClass ru=new ReusableClass();
		
		ru.selectByIndex(drop, 13);
		
		ru.selectbyvalue(drop, "search-alias=automotive");
		
		
		
	}

}
