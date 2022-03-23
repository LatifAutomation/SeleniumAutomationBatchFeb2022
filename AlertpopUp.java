package AlertsandPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertpopUp {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://chercher.tech/practice/popups");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("confirmation")).click();
		
		//Switch focus to alert
		
		Alert alt=driver.switchTo().alert();
		
		String text = alt.getText();
		System.out.println(text);
		
		//Ok button
		
		//alt.accept();
		
		//Cancel
		
		alt.dismiss();
		
		

	}

}
