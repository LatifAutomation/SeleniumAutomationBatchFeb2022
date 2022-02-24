package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		//Open the url
		driver.get("https://www.amazon.com");
		
		
		//close the parent window
		
		driver.close();
		

	}

}
