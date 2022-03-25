package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		
		hp.headerverify();
		hp.clickGetstartedFree();
		
		
		FreeAccountPage fa=new FreeAccountPage(driver);
		
		fa.enterFullname();
		fa.enteremail();
		fa.enterpass();
		fa.checkboxclick();
		fa.signupClick();
		
	}

}
