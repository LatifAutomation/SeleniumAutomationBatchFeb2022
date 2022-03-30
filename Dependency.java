package TestNGPackage;

import org.testng.annotations.Test;

public class Dependency 
{
 
	@Test 
	
	public void registartion()
	{
		System.out.println(" I am in Registartion page");
	}
	
	
    @Test(dependsOnMethods="reportgeneration")
	public void logout()
	{
		System.out.println("Logout completed");
	}
	
	@Test(dependsOnMethods="productsearch")
	public void payment()
	{
		System.out.println("I am Payment page");
	}
	
	
	
    @Test(dependsOnMethods="login")
	
	public void productsearch()
	{
		System.out.println("I am in Product Search page");
	}
	
    
	@Test(dependsOnMethods="registartion")
	public void login()
	{
		System.out.println(" I am in Login page");
	}
	
	
	@Test(dependsOnMethods="payment")
	public void reportgeneration()
	{
		System.out.println("Report Generated");
	}
	
	
	
}
