package AlertsandPopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowbaedpopUp {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		
		String pid = driver.getWindowHandle();
		System.out.println(pid);
		
		driver.findElement(By.xpath("//input[@value='New Window']")).click();
		
		Set<String> cids = driver.getWindowHandles();
		System.out.println(cids);
		
		
		for(String str: cids)
			
		{
			WebDriver ele = driver.switchTo().window(str);
			String title = ele.getTitle();
			System.out.println(title);
		}

	}

}
