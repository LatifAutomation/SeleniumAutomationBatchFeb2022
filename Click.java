package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Identify the elemnt'
		
		WebElement abc = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement btn = driver.findElement(By.id("nav-search-submit-button"));
		
		//Craete the object of Actions clas
		
		
		Actions act=new Actions(driver);
		
		act.sendKeys(abc, "mobile").perform();
		Thread.sleep(3000);
		
		act.click(btn).perform();
		
		
		
		
		
	}

}
