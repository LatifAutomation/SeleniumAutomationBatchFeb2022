package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		
		HomePage hp=new HomePage(driver);
		hp.verifyHeader();
		//hp.signupClick();
		hp.signinClick();
		
		/*SignUpClass sp=new SignUpClass(driver);
		sp.enterFullname("naina");
		sp.enteremail("naina21n@gmail.com");
		sp.enterpass("Test@12345");
		sp.checkboxclick();
		sp.submitclick();*/
		
		SignInpage si=new SignInpage(driver);
		si.username("naikpratibha263@gmail.com");
		si.password("Test@1234");
		si.signInClick();
		
	}

}
