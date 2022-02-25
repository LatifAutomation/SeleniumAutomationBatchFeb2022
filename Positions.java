package Navigation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Positions {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		Dimension d=new Dimension(250,300);
		
		driver.manage().window().setSize(d);

	}

}
