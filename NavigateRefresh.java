package Navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateRefresh {

	public static void main(String[] args) throws InterruptedException 
	{
	
		  ChromeDriver driver=new ChromeDriver();
			
			driver.navigate().to("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			driver.navigate().to("https://www.facebook.com/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			Thread.sleep(3000);
			
			//Naviagte back to Amazon page
			
			driver.navigate().back();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			Thread.sleep(3000);
			
			//Navigate forward
			
			driver.navigate().forward();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			Thread.sleep(5000);
			
			//Navigate Refresh
			
			driver.navigate().refresh();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
	}

}
