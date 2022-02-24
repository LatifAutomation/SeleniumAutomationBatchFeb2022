package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D://ChromeSetup/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		
	}

}
