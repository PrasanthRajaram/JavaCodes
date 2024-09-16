package testNGbasic;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test(priority=1)
	public void signup()
	{
		System.out.println("Signup");
	}
	@Test(priority=2)
	public void login()
	{
		System.out.println("login");
	}
	@Test(dependsOnMethods = "addtocart")
	public void searchprduct()
	{
		System.out.println("searchprduct");
	}
	@Test(priority=4)
	public void addtocart()
	{
		System.out.println("addtocart");
	}
	@Test(priority=5)
	public void signout()
	{
		System.out.println("signout");
	}

}
