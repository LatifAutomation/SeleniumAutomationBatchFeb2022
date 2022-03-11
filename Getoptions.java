package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoptions {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//
		WebElement drp = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//
		
		Select sel=new Select(drp);
		
		List<WebElement> opts = sel.getOptions();
		
		int sz = opts.size();
		System.out.println(sz);
		
		
		
		for(int i=0;i<sz;i++)
		{
			WebElement ele = opts.get(i);
			
			String txt = ele.getText();
			System.out.println(txt);
			
		}

		
		
		for(WebElement web:opts)
		{
			System.out.println(web.getText());
		}
	}

}
