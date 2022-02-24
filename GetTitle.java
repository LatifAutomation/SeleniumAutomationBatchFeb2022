package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) 
	{
		ChromeDriver abc=new ChromeDriver();
		
		abc.get("https://www.amazon.in/");
		
		String title = abc.getTitle();
		
		System.out.println(title);
		
	

	}

}
