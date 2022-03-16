package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Release {

	public static void main(String[] args) 
	{
		
       ChromeOptions handlingSSL = new ChromeOptions();
		
		handlingSSL.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(handlingSSL);
		
		
		
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		/*act.clickAndHold(src);
		act.moveToElement(dest);
		act.release(src).perform();*/
		
		act.clickAndHold(src).moveToElement(dest).release(src).build().perform();
	
		
		
		
	}

}
