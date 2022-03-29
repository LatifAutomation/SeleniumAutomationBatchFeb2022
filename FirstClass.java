package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstClass 
{
  
	@Test(priority=0)
	public void first()
	{
		System.out.println(" I am in first Test case");
	}
  
  
	@Test(priority=1)
	
	public void second()
	{
		System.out.println(" I am Second Test case");
		
	} 
	
	@Test(priority=-2)
	public void third()
	{
		System.out.println(" I am in Third Tets case");
	}
	
	
	@Test()
	public void four()
	{
		System.out.println(" I am in four Tets case");
	
	}
	
	
	@Test(priority=-4)
	public void fifth()
	{
		System.out.println(" I am in fifth Tets case");
	}
	
}
