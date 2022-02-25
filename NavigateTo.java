package Navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		

	}

}
