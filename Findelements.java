package FinDElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		//Identify the links on page
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int sz = links.size();
		
		System.out.println(sz);
		
		
		for(int i=0;i<sz;i++)
		{
			WebElement ele = links.get(i);
			
			String txt = ele.getText();
			
			System.out.println(txt);
		}
		
		
	}

}
