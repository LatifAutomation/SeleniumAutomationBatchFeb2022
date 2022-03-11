package Dropdown;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableClass
{

	public void selectByIndex(WebElement dropdown,int index)
	{
		Select sel=new Select(dropdown);
		sel.selectByIndex(index);
		
	}
	
	
	public void selectbyvalue(WebElement drp2,String value)
	{
		Select sel=new Select(drp2);
		sel.selectByValue(value);
	}
	
	
	public void seeltByvisibleText(WebElement drp3,String text)
	{
		Select sel=new Select(drp3);
		sel.deselectByVisibleText(text);
	}

	}


