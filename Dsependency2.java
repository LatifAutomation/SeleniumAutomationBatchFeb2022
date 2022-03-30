package TestNGPackage;

import org.testng.annotations.Test;

public class Dsependency2 
{

	
	@Test(dependsOnMethods= {"TC4","TC3"})
	
	public void TC1()
	{
		System.out.println("Test case1 ");
	}
	
	
	
   @Test
	
	public void TC2()
	{
		System.out.println("Test case 2 ");
	}
   
   
   
    @Test(priority=1)
	public void TC3()
	{
		System.out.println("Test case 3  ");
	}
    
    @Test(priority=-1)
   	public void TC4()
   	{
   		System.out.println("Test case 4  ");
   	}
    
}
