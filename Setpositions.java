package Navigation;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setpositions {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Point p=new Point(200,380);
		driver.manage().window().setPosition(p);
		

	}

}
