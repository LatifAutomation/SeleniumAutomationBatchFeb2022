package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assiment1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		//Print the title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Print the Current URL
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		//close the Browser
		
		driver.close();
		
	}

}
